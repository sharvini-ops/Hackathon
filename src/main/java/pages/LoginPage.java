package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By email = By.xpath("//input[@data-qa='login-email']");
    private By password = By.xpath("//input[@data-qa='login-password']");
    private By loginBtn = By.xpath("//button[@data-qa='login-button']");
    private By errorMsg = By.xpath("//p[contains(text(),'incorrect')]");

    public void login(String userEmail, String userPassword) {
        type(driver.findElement(email), userEmail);
        type(driver.findElement(password), userPassword);
        click(driver.findElement(loginBtn));
    }

    public String getErrorMessage() {
        return getText(driver.findElement(errorMsg));
    }
}