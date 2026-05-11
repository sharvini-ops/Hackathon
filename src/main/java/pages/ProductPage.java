package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private By searchBox = By.id("search_product");
    private By searchBtn = By.id("submit_search");
    private By firstProduct = By.xpath("(//div[@class='productinfo text-center'])[1]/p");
    private By addToCartBtn = By.xpath("(//a[contains(text(),'Add to cart')])[1]");

    public void searchProduct(String product) {
        type(driver.findElement(searchBox), product);
        click(driver.findElement(searchBtn));
    }

    public String getFirstProductName() {
        return getText(driver.findElement(firstProduct));
    }

    public void addFirstProductToCart() {
        click(driver.findElement(addToCartBtn));
    }
}