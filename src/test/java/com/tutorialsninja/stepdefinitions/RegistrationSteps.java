package com.tutorialsninja.stepdefinitions;

import com.tutorialsninja.base.DriverSetup;
import com.tutorialsninja.pages.RegistrationPage;
import com.tutorialsninja.utils.ScreenshotUtil;

import io.cucumber.java.en.*;

public class RegistrationSteps {

    RegistrationPage register;

    @Given("User is on Registration page")
    public void user_is_on_registration_page() {

        DriverSetup.driver.get(
        "https://tutorialsninja.com/demo/index.php?route=account/register");

        register = new RegistrationPage(
                DriverSetup.driver);
    }

    @When("User enters registration details {string} {string} {string} {string}")
    public void user_enters_registration_details(
            String fn,
            String ln,
            String phone,
            String pwd) {

        String email =
                "khushbu"
                + System.currentTimeMillis()
                + "@gmail.com";

        register.registerUser(
                fn,
                ln,
                email,
                phone,
                pwd);
    }

    @And("Clicks on Continue button")
    public void clicks_on_continue_button() {

        register.clickContinue();
    }

    @Then("Account should be created successfully")
    public void account_should_be_created_successfully()
            throws Exception {

        ScreenshotUtil.captureScreenshot(
                DriverSetup.driver,
                "Registration_Success");

        Thread.sleep(3000);

        System.out.println("Registration Successful");
    }
}