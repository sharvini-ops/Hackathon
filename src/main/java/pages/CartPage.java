package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private By productName = By.xpath("//td[@class='cart_description']//a");
    private By productPrice = By.xpath("//td[@class='cart_price']/p");
    private By deleteBtn = By.xpath("//a[@class='cart_quantity_delete']");

    public String getCartProductName() {
        return getText(driver.findElement(productName));
    }

    public String getCartProductPrice() {
        return getText(driver.findElement(productPrice));
    }

    public void removeProduct() {
        click(driver.findElement(deleteBtn));
    }
}