package com.tutorialsninja.stepdefinitions;

import com.tutorialsninja.base.DriverSetup;
import com.tutorialsninja.utils.ScreenshotUtil;

import io.cucumber.java.en.*;

public class CheckoutSteps {

    @Given("Product is available in cart")
    public void product_is_available_in_cart() {

    }

    @When("User proceeds to checkout")
    public void user_proceeds_to_checkout() {

    }

    @Then("Checkout page should be displayed")
    public void checkout_page_should_be_displayed()
            throws Exception {

        ScreenshotUtil.captureScreenshot(
                DriverSetup.driver,
                "Checkout_Success");

        Thread.sleep(3000);

        System.out.println("Checkout Page Opened");
    }
}