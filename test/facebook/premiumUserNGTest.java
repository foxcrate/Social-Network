/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

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
public class premiumUserNGTest {
    
    public premiumUserNGTest() {
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
     * Test of getBankAccount method, of class premiumUser.
     */
    @Test
    public void testGetBankAccount() {
        System.out.println("getBankAccount");
        premiumUser instance = new premiumUser();
        String expResult = "";
        String result = instance.getBankAccount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBankAccount method, of class premiumUser.
     */
    @Test
    public void testSetBankAccount() {
        System.out.println("setBankAccount");
        String a = "";
        premiumUser instance = new premiumUser();
        instance.setBankAccount(a);

    }

    /**
     * Test of signUp method, of class premiumUser.
     */
    @Test
    public void testSignUp() {
        System.out.println("signUp");
        premiumUser instance = new premiumUser();
        //instance.signUp();
        //assertEquals(actual, expected);
    }
    
}
