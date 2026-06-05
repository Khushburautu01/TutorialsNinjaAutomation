package com.tutorialsninja.stepdefinitions;

import com.tutorialsninja.base.DriverSetup;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.utils.ScreenshotUtil;

import io.cucumber.java.en.*;

public class ProductSteps {

    ProductPage productPage;

    @Given("User is on Home page")
    public void user_is_on_home_page() {

        DriverSetup.driver.get(
                "https://tutorialsninja.com/demo/");

        productPage =
                new ProductPage(
                        DriverSetup.driver);
    }

    @When("User searches for {string}")
    public void user_searches_for(String product) {

        productPage.searchProduct(product);
    }

    @Then("Verify search result {string}")
    public void verify_search_result(String result)
            throws Exception {

        ScreenshotUtil.captureScreenshot(
                DriverSetup.driver,
                "ProductSearch_" + result);

        Thread.sleep(3000);

        System.out.println(result);
    }
}