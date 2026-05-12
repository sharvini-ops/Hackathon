package dataproviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        //Creating 2D array
        return new Object[][]{

                // Successfully login
                {"santhsharvini7@gmail.com", "Sharlife@97", "valid"},

                //Invalid username or password -> error message
                {"santhsharvini7@gmail.com", "sharlife97", "invalid"}
        };
    }
}