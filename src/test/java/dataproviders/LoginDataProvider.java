package dataproviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        return new Object[][]{
                {"santhsharvini7@gmail.com", "Sharlife@97", "valid"},
                {"santhsharvini7@gmail.com", "sharlife97", "invalid"}
        };
    }
}