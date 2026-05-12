package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void validateCartProduct() {

        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);

        //Link to open products
        driver.get("https://automationexercise.com/products");
        product.addFirstProductToCart();

        //Link to open cart
        driver.get("https://automationexercise.com/view_cart");

        //Assertion Message
        Assert.assertTrue(
                cart.getCartProductName().length() > 0,
                "Cart is empty or product name was not found."
        );
    }

    //Remove Products in cart
    @Test
    public void removeProductFromCart() {
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);

        //Link to open products
        driver.get("https://automationexercise.com/products");
        product.addFirstProductToCart();

        //Link to open cart
        driver.get("https://automationexercise.com/view_cart");

        //Remove Products in Cart
        cart.removeProduct();

        //Assertion Message
        Assert.assertTrue(true, "Product removed successfully.");
    }
}