/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.util.ArrayList;

/**
 *
 * @author Fawzy
 */
public class group {
    private String groupName;
    private int groupID;
    ArrayList<user> admins = new ArrayList(10);
    ArrayList<user> joiners = new ArrayList(10);

    public void addAdmin(int userID){
        
    }
    public void joinGroup(int userID){
        
    }
    public void addPost(String text){
        
    }
    public boolean isMember(int userID){
        return false;
    }
    public void leaveGroup(int userID){
        
    }
    public void deleteGroup(){
        
    }
    public post retrivePost(int postID){
        return null;
        
    }

}
