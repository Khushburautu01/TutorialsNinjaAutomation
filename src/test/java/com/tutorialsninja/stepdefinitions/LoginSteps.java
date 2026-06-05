package com.tutorialsninja.stepdefinitions;

import com.tutorialsninja.base.DriverSetup;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.utils.ScreenshotUtil;

import io.cucumber.java.en.*;

public class LoginSteps {

    LoginPage loginPage;

    @Given("User is on Login page")
    public void user_is_on_login_page() {

        DriverSetup.driver.get(
        "https://tutorialsninja.com/demo/index.php?route=account/login");

        loginPage = new LoginPage(DriverSetup.driver);
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String email, String password) {

        loginPage.login(email, password);
    }

    @And("Clicks Login button")
    public void clicks_login_button() {

    }

    @Then("Verify {string}")
    public void verify(String result) throws Exception {

        ScreenshotUtil.captureScreenshot(
                DriverSetup.driver,
                "Login_" + result);

        Thread.sleep(3000);

        System.out.println("Result: " + result);
    }
}