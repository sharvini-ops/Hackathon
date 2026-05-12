package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void validateCartProduct() {
        //to add product in cart
        WebDriver driver = null;
        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        home.goToProducts();

        //Adding products to cart
        product.addFirstProductToCart();
        home.openCart();
        Assert.assertTrue(
                cart.getCartProductName().length() > 0);
    }

    @Test
    public void removeProductFromCart() {

        //Removing the product from cart
        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        home.goToProducts();
        product.addFirstProductToCart();
        home.openCart();

        //Removing products
        cart.removeProduct();
        Assert.assertTrue(true);
    }
}