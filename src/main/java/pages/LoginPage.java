package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        // Wait time is 40
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    //xpath locators
    By loginLink = By.xpath("//a[contains(text(),'Signup / Login')]");
    By emailField = By.xpath("//input[@data-qa='login-email']");
    By passwordField = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[contains(text(),'Login')]");
    By errorMessage = By.xpath("//p[contains(text(),'Your email') or contains(text(),'incorrect')]");
    By logoutBtn = By.xpath("//a[contains(text(),'Logout')]");

    //Click Login to Access
    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
    }

    //Enter username to login
    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
    }

    //Enter password to login
    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    //Click login Button
    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    //Verifying Login success or not
    public void login(String email, String password) {
        clickLogin();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    //
    public String getErrorMessage() {

        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(errorMessage)
            ).getText();
        } catch (Exception e) {
            return "ERROR MESSAGE NOT FOUND";
        }
    }

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)).click();
    }
}