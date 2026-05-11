package dataproviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        return new Object[][]{
                {"validuser@example.com", "password123", "valid"},
                {"wronguser@example.com", "wrongpass", "invalid"}
        };
    }
}