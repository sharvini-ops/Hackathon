package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    // Locators
    private By signupLoginLink = By.xpath("//a[contains(text(),'Signup / Login')]");
    private By emailField = By.xpath("//input[@data-qa='login-email']");
    private By passwordField = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");

    // Error message shown for invalid or empty login
    private By errorMessage = By.cssSelector("form[action='/login'] p");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Open login page
    public void openLoginPage() {
        wait.until(ExpectedConditions.elementToBeClickable(signupLoginLink)).click();
    }

    // Perform login
    public void login(String email, String password) {
        openLoginPage();
        type(emailField, email);
        type(passwordField, password);
        click(loginButton);
    }

    // Get error message
    public String getErrorMessage() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(errorMessage)
        ).getText();
    }
}

//LoginPage

//New Browser login page
//Login with correct (username, password)
//Login with correct username and wrong password