package com.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By searchBox = By.name("search");
    By searchBtn = By.xpath("//div[@id='search']//button");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {

        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchBtn).click();
    }
}