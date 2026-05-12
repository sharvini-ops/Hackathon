package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    //Move Products to checkout from cart
    public CheckoutPage(WebDriver driver) {

        this.driver = driver;

        //wait time is 40
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    //Checkout button
    By checkoutBtn =
            By.xpath("//a[contains(text(),'Proceed To Checkout')]");

    //Placing order
    public void clickPlaceOrder() {

        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn));

        //Clicking checkout Button
        driver.findElement(checkoutBtn).click();
    }
}