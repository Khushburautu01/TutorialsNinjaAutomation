package com.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {

        driver.findElement(
                By.xpath("//button[contains(@onclick,'cart.add')]"))
                .click();
    }
}