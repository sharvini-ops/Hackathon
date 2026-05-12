package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        //2D Array
        return new Object[][]{

                // Valid Login
                {"santhsharvini7@gmail.com", "Sharlife@97", "valid"},

                // Invalid Login
                {"santhsharvini7@gmail.com", "wrong123", "invalid"}
        };
    }

    @Test(dataProvider = "loginData")
    public void validateLogin(String email, String password, String type) {

        LoginPage login = new LoginPage(driver);

        //Login with email and password
        login.login(email, password);

        //Check Login successful or not
        if (type.equals("valid")) {

            //Assertion Message
            Assert.assertTrue(driver.getCurrentUrl().contains("automationexercise"));
        }
        else {

            //Assertion Message
            Assert.assertTrue(login.getErrorMessage().contains("incorrect")
            );
        }
    }
}