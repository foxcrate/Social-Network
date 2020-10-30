
package facebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fawzy
 */
public class Facebook {

    static ArrayList<user>usersList = new ArrayList();
    public static void main(String[] args) throws IOException {
        //userNGTest a = new userNGTest(); 
        normalUser a=new normalUser();
        a.setName("ahmed");
        a.setPassword("123");
        normalUser b=new normalUser();
        b.setName("nada");
        b.setPassword("123");
        normalUser c=new normalUser();
        c.setName("nagwa");
        c.setPassword("123");
        //a.friendRequests.add(c);
        //a.friendRequests.add(b);
        a.createPost("ana Ahmed");
        b.createPost("ana Nada");
        c.createPost("ana Nagwa");
        usersList.add(a);
        //System.out.print(a.friendRequests.get(0).getName());
        usersList.add(b);
        usersList.add(c);
        BufferedReader reader =  
        new BufferedReader(new InputStreamReader(System.in));
        ///////////////
        
        /////////////////////
        while(true){
    
        System.out.println("Welcome to facebook");
        System.out.println("-signup- or -login-");
        
        
        switch(reader.readLine()){
            case "signup":
            {
            System.out.println("-normal- or -premium- user");
            switch (reader.readLine()) {
                case "normal":
                    {
                        normalUser x=new normalUser();
                        x.signUp(usersList);
                        break;
                    }
                case "premium":
                    {
                        premiumUser x=new premiumUser();
                        x.signUp(usersList);
                        break;
                    }
            }
            break;
            }
        case "login":
            {
                System.out.println("please enter your name and password");
                normalUser x=new normalUser();
                x.setName(reader.readLine());
                x.setPassword(reader.readLine());
                boolean founded=false;
            for (user usersList1 : usersList) {
                if (usersList1.getName().equals(x.getName())) {
                    if (usersList1.getPassword().equals(x.getPassword())) {
                        usersList1.login(usersList);
                        founded=true;
                        break;
                    }
                    else{
                    System.out.println("Wrong password");
                    break;
                }
                }
            }
            if(founded==false){
                System.out.println("Wrong name!");
            }
            break;
            }
        }
        }
       
        /*System.out.print("name: ");
        System.out.print((usersList.get(0)).getName()+"\n");
        System.out.print("gender: ");
        System.out.print((usersList.get(0)).getGender()+"\n");
        System.out.print("mail: ");
        System.out.print((usersList.get(0)).getMail()+"\n");
        System.out.print("bank Account: ");
        //user o = usersList.get(0);
        if (usersList.get(0) instanceof premiumUser) {
            premiumUser child = (premiumUser) usersList.get(0);
            // Do something with child
            System.out.print(child.getBankAccount() +"\n");
        }*/
    }
    
}