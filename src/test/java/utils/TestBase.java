package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.get("https://dev.hellobooks.ai/");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

