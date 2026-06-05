package com.tutorialsninja.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;

    By searchBox = By.name("search");
    By searchBtn = By.xpath("//div[@id='search']//button");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {

    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
    	driver.findElement(searchBox).clear();
    	driver.findElement(searchBox).sendKeys(productName);
    	
    }
}