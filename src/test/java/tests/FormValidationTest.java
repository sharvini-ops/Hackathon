package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class FormValidationTest extends BaseTest {

    @Test
    public void emptyLoginValidation() {

        LoginPage login = new LoginPage(driver);

        // Open Login PageE
        login.clickLogin();

       //Invalid data
        login.enterEmail("invalid@test.com");
        login.enterPassword("wrongpassword");
        login.clickLoginButton();

        // Error Message
        String msg = login.getErrorMessage();

        //Printing the error message
        System.out.println("ERROR MSG: " + msg);

        //Assertion Message
        Assert.assertTrue(
                msg.toLowerCase().contains("incorrect") ||
                        msg.toLowerCase().contains("email") ||
                        msg.toLowerCase().contains("password"),
                "Error message not displayed properly"
        );
    }
}