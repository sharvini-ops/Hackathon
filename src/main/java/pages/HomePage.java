package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By logoutBtn = By.xpath("//a[text()=' Logout']");
    private By loginLink = By.xpath("//a[text()=' Signup / Login']");
    private By productsLink = By.xpath("//a[text()=' Products']");

    public void clickLogin() {
        click(driver.findElement(loginLink));
    }

    public void clickLogout() {
        click(driver.findElement(logoutBtn));
    }

    public void goToProducts() {
        click(driver.findElement(productsLink));
    }
}