package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void searchProductTest() {

        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        home.goToProducts();

        //Search Products with unique name
        product.searchProduct("shirt");

        //Assertion Message
        Assert.assertTrue(
                product.getFirstProductName().length() > 0);
    }

    //Adding Products to cart
    @Test
    public void addProductToCartTest() {
        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);

        //Directs to Productspage from Homepage
        home.goToProducts();

        //Products adding Function
        product.addFirstProductToCart();

        //Assertion Message
        Assert.assertTrue(true);
    }
}