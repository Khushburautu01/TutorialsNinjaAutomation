package com.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerUser(String fn, String ln,
                             String email, String phone,
                             String pwd) {

        driver.findElement(By.id("input-firstname"))
                .sendKeys(fn);

        driver.findElement(By.id("input-lastname"))
                .sendKeys(ln);

        driver.findElement(By.id("input-email"))
                .sendKeys(email);

        driver.findElement(By.id("input-telephone"))
                .sendKeys(phone);

        driver.findElement(By.id("input-password"))
                .sendKeys(pwd);

        driver.findElement(By.id("input-confirm"))
                .sendKeys(pwd);

        driver.findElement(By.name("agree")).click();
    }

    public void clickContinue() {

        driver.findElement(
                By.cssSelector("input[value='Continue']"))
                .click();
    }
}