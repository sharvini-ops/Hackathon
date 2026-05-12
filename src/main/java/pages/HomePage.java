package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    //Home page to direct cart, product and sigup/login
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Web element locators
    By productsBtn = By.xpath("//a[contains(text(),'Products')]");
    By cartBtn = By.xpath("//a[contains(text(),'Cart')]");
    By loginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");

    //Move to Products from Home page
    public void goToProducts() {
        driver.findElement(productsBtn).click();
    }

    //Opening cart form Home page
    public void openCart() {
        driver.findElement(cartBtn).click();
    }

    //Click login to access website
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}