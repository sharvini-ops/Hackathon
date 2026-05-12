package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {

        this.driver = driver;

        //Web Driver waiting time is 40
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    //Web elements locators
    By searchBox = By.id("search_product");
    By searchBtn = By.id("submit_search");

    By firstProduct =
            By.xpath("(//div[@class='productinfo text-center']//p)[1]");
    By addToCartBtn =
            By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    By continueShopping =
            By.xpath("//button[contains(text(),'Continue Shopping')]");

    //Search Products with specific name
    public void searchProduct(String productName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(searchBox).sendKeys(productName);

        //Click SearchButton
        driver.findElement(searchBtn).click();
    }

    //To get First ProductName
    public String getFirstProductName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct));

        //Get text of first product
        return driver.findElement(firstProduct).getText();
    }

    //Adding Product to cart
    public void addFirstProductToCart() {

        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Checking Products list in Cart
        js.executeScript("arguments[0].scrollIntoView(true);", addToCart);
        js.executeScript("arguments[0].click();", addToCart);

        //Show option Continue Shopping
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping));
        driver.findElement(continueShopping).click();
    }
}