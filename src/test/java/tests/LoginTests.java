package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

import java.util.Objects;

public class LoginTests extends TestBase {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);


        loginPage.enterEmail(System.getProperty("loginEmail", "rathodkeval70901@gmail.com"));
        loginPage.enterPassword(System.getProperty("loginPassword", "Keval@1006"));
        loginPage.clickLogin();

        // Check if user lands on dashboard
        Assert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("dashboard"),
                "User should land on Dashboard after valid login");
    }

    @Test
    public void invalidLoginTest() {
        new LoginPage(driver);

    }
}
