/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fawzy
 */
public abstract class user {

    private String name;
    private String password;
    private String gender;
    private String mail;
    ArrayList<user> userFriends = new ArrayList(10);
    ArrayList<user> friendRequests = new ArrayList(10);
    ArrayList<post> posts = new ArrayList(10);
    ArrayList<group> userJoinedGroups = new ArrayList(10);
    ArrayList<page> userLikedPages = new ArrayList(10);
    BufferedReader reader
            = new BufferedReader(new InputStreamReader(System.in));

    public abstract void signUp(ArrayList<user> usersList);

    public void createPost(String post) {
        post a = new post();
        a.text = post;
        this.posts.add(a);
    }

    public void checkFriendRequests() throws IOException {
        //boolean stop=false;
        if ((this.friendRequests.size()) == 0) {
            System.out.println("You have no friend requests");
        } else {
            for (user usersList1 : this.friendRequests) {
                System.out.println(usersList1.getName() + "--> send you a friend request");
                System.out.println("-accept" + "\n" + "-remove");
                switch (reader.readLine()) {
                    case "accept": {
                        this.userFriends.add(usersList1);
                        usersList1.userFriends.add(this);
                        //this.friendRequests.remove(usersList1);
                        break;
                    }
                    case "remove": {
                        //this.friendRequests.remove(usersList1);
                        break;
                    }

                }
            }
            this.friendRequests.clear();
        }
    }

    public void sendFriendRequest(ArrayList<user> usersList) {
        try {
            boolean founded = false;
            System.out.println("Please enter your friend's name");
            String name = reader.readLine();
            for (user usersList1 : usersList) {
                if (usersList1.getName().equals(name)) {
                    founded = true;
                    usersList1.friendRequests.add(this);
                }
            }
            if (founded == true) {
                System.out.println("Founded, friend request.. sent");

            }
            if (founded == false) {
                System.out.println("Not founded");
            }
        } catch (IOException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void viewTimeline() {
        for (user usersList1 : this.userFriends) {
            if (usersList1.posts.isEmpty()) {
                System.out.println(usersList1.getName() + "--> don't have any posts");
            } else {
                System.out.println(usersList1.getName() + "-->" + "\n");
                for (post post1 : usersList1.posts) {
                    System.out.println("-" + post1.text + "\n");
                }
            }
        }
    }

    public void login(ArrayList<user> usersList) throws IOException {
        System.out.println("Welcome to your account");
        this.checkFriendRequests();
        boolean logout = false;
        while (true) {
            if (logout == true) {
                break;
            }
            System.out.println("-find friends?" + "\n" + "-timeline?" + "\n" + "-logout?"
                    + "\n" + "-upgrade?" + "\n" + "-add ADS?" + "(premium option)");
            switch (reader.readLine()) {
                case "find friends": {
                    sendFriendRequest(usersList);
                    /*boolean founded = false;
                     System.out.println("Please enter your friend's name");
                     String name = reader.readLine();
                     for (user usersList1 : usersList) {
                     if (usersList1.getName().equals(name)) {
                     founded = true;
                     usersList1.friendRequests.add(this);
                     }
                     }
                     if (founded == true) {
                     System.out.println("Founded, friend request.. sent");

                     }
                     if (founded == false) {
                     System.out.println("Not founded");
                     }*/
                    break;
                }

                case "timeline": {
                    this.viewTimeline();
                    /*for (user usersList1 : this.userFriends) {
                     if (usersList1.posts.isEmpty()) {
                     System.out.println(usersList1.getName() + "--> don't have any posts");
                     } else {
                     System.out.println(usersList1.getName() + "-->" + "\n");
                     for (post post1 : usersList1.posts) {
                     System.out.println("-" + post1.text + "\n");
                     }
                     }
                     }*/
                    break;
                }
                case "logout": {
                    logout = true;
                    break;
                }
                case "add ADS": {
                    if (this instanceof premiumUser) {
                        premiumUser x = (premiumUser) this;
                        // Do something with child
                        for (post post1 : x.posts) {
                            post1.likes = post1.likes + 10;
                        }
                        System.out.println("ADS added succesfully");
                    } else {
                        System.out.println("You ar not a premium user!");
                    }
                    break;
                }
                case "upgrade": {
                    System.out.println("By upgrading your account you will pay $99 per year"
                            + "\n" + "-accept?" + "\n" + "-deny?");
                    switch (reader.readLine()) {
                        case "accept": {
                            premiumUser x = new premiumUser();
                            x.setName(this.getName());
                            x.setPassword(this.getPassword());
                            x.setGender(this.getGender());
                            x.setMail(this.getMail());
                            System.out.println("Enter your bank account");
                            x.setBankAccount(reader.readLine());
                            usersList.remove(this);
                            this.setName("00");
                            usersList.add(x);
                            logout = true;
                            break;
                        }
                        case "deny": {
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
//Setters and Getters

    public String getName() {
        return this.name;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String userPassword) {
        this.password = userPassword;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String userGender) {
        this.gender = userGender;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String userMail) {
        this.mail = userMail;
    }
}
