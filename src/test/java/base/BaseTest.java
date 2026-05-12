package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Browser to perform
        driver = new ChromeDriver();
        //Browser wait time
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(20));
        // Link to open browser
        driver.get("https://automationexercise.com");
    }
    //After performing all testcases to quit the browser
    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


//User login and form validation
//Product search and selection
//Cart operations (add, validate, remove)
//Checkout and payment flow

