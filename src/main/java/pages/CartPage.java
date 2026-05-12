package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    //Cart page
    public CartPage(WebDriver driver) {
        this.driver = driver;

        //Wait time is 40
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }
    //When all elements names are same
    By cartProduct =
            By.xpath("//td[@class='cart_description']//a");
    By deleteBtn =
            By.xpath("//a[@class='cart_quantity_delete']");

    //To get Product name in cart
    public String getCartProductName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartProduct));

        //Get name of the product
        return driver.findElement(cartProduct).getText();
    }

    //Remove Product from cart
    public void removeProduct() {

        wait.until(ExpectedConditions.elementToBeClickable(deleteBtn));

        //to click the delete button of product
        driver.findElement(deleteBtn).click();
    }
}