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
public class premiumUser extends user {
    private String bankAccount;
    public String getBankAccount(){
        return this.bankAccount;
    }
    public void setBankAccount(String a){
        this.bankAccount=a;
    }
    public void signUp(ArrayList<user> usersList) {
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
            System.out.println("Enter your bankAccount");
            this.setBankAccount(reader.readLine());
            usersList.add(this);
        } catch (IOException ex) {
            Logger.getLogger(premiumUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void createAdsForGroup(){
        
    }
    public void createAdsForPage(){
        
    }
    public void createAdsForPost(){
        for (post post1 : this.posts) {
                            post1.likes = post1.likes + 10;
                        }
                        System.out.println("ADS added succesfully");
    
    
}

  
}
