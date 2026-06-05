package com.tutorialsninja.stepdefinitions;

import com.tutorialsninja.base.DriverSetup;
import com.tutorialsninja.pages.CartPage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.utils.ScreenshotUtil;

import io.cucumber.java.en.*;

public class CartSteps {

    ProductPage productPage;
    CartPage cartPage;

    @Given("User searches for a product")
    public void user_searches_for_a_product() {

        DriverSetup.driver.get(
                "https://tutorialsninja.com/demo/");

        productPage =
                new ProductPage(
                        DriverSetup.driver);

        productPage.searchProduct("iPhone");

        cartPage =
                new CartPage(
                        DriverSetup.driver);
    }

    @When("User adds product to cart")
    public void user_adds_product_to_cart() {

        cartPage.addToCart();
    }

    @Then("Product should be available in cart")
    public void product_should_be_available_in_cart()
            throws Exception {

        ScreenshotUtil.captureScreenshot(
                DriverSetup.driver,
                "Cart_Success");

        Thread.sleep(3000);

        System.out.println("Added To Cart");
    }
}