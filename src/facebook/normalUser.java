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
public class normalUser extends user {
    public void signUp(ArrayList<user> usersList){
        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name");
            this.setName(reader.readLine());
            System.out.println("Enter your mail");
            this.setMail(reader.readLine());
            System.out.println("Enter your gender");
            this.setGender(reader.readLine());
            System.out.println("Enter your password");
            this.setPassword(reader.readLine());
            usersList.add(this);
        } catch (IOException ex) {
            Logger.getLogger(normalUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
