/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import static facebook.Facebook.usersList;
import static facebook.userNGTest.usersList;
import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ahmed
 */
public class userNGTest {

    static ArrayList<user> usersList = new ArrayList();

    public userNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of signUp method, of class user.
     */
    @Test
    public void testSignUp() {
        System.out.println("signUp");
        user instance = new normalUser();
        int expected = usersList.size() + 1;
        instance.signUp(usersList);

        assertEquals(usersList.size(), expected);
    }

    /*@Test
     public void testSendFriendRequest() {
     System.out.println("send friend request");
     user instance = new normalUser();
     int expected = instance.friendRequests.size() + 1;
     instance.sendFriendRequest(usersList);

     assertEquals(usersList.size(), expected);
     }*/
//    /**
//     * Test of createPost method, of class user.
//     */
//    @Test
//    public void testCreatePost() {
//        System.out.println("createPost");
//        String post = "";
//        user instance = new userImpl();
//        instance.createPost(post);
//    }
//
//    /**
//     * Test of checkFriendRequests method, of class user.
//     */
    /*@Test
    //test the accept part
    public void testCheckFriendRequests() throws Exception {
        System.out.println("checkFriendRequests");
        user instance = new normalUser();
        int expected= instance.userFriends.size()+1;
        instance.checkFriendRequests();
        assertEquals(usersList.size(), expected);
    }*/

//     * Test of login method, of class user.
//     */
//    @Test
//    public void testLogin() throws Exception {
//        System.out.println("login");
//        ArrayList<user> usersList = null;
//        user instance = new userImpl();
//        instance.login(usersList);
//
//    }
//
//    /**
//     * Test of getName method, of class user.
//     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        user instance = new userImpl();
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(result, expResult);
//    }
//
//    /**
//     * Test of setName method, of class user.
//     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String userName = "";
//        user instance = new userImpl();
//        instance.setName(userName);
//    }
//
//    /**
//     * Test of getPassword method, of class user.
//     */
//    @Test
//    public void testGetPassword() {
//        System.out.println("getPassword");
//        user instance = new userImpl();
//        String expResult = "";
//        String result = instance.getPassword();
//        assertEquals(result, expResult);
//    }
//
//    /**
//     * Test of setPassword method, of class user.
//     */
//    @Test
//    public void testSetPassword() {
//        System.out.println("setPassword");
//        String userPassword = "";
//        user instance = new userImpl();
//        instance.setPassword(userPassword);
//    }
//
//    /**
//     * Test of getGender method, of class user.
//     */
////    @Test
////    public void testGetGender() {
////        System.out.println("getGender");
////        user instance = new userImpl();
////        String expResult = "";
////        String result = instance.getGender();
////        assertEquals(result, expResult);
////    }
//
//    /**
//     * Test of setGender method, of class user.
//     */
//    @Test
//    public void testSetGender() {
//        System.out.println("setGender");
//        String userGender = "";
//        user instance = new userImpl();
//        instance.setGender(userGender);
//    }
//
//    /**
//     * Test of getMail method, of class user.
//     */
//    @Test
//    public void testGetMail() {
//        System.out.println("getMail");
//        user instance = new userImpl();
//        String expResult = "";
//        String result = instance.getMail();
//        assertEquals(result, expResult);
//    }
    /**
     * Test of setMail method, of class user.
     */
//    @Test
//    public void testSetMail() {
//        System.out.println("setMail");
//        String userMail = "";
//        user instance = new userImpl();
//        instance.setMail(userMail);
//    }
    public class userImpl extends user {

        @Override
        public void signUp(ArrayList<user> usersList) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        //public void signUp() {
    }
}
