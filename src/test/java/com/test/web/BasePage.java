package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by dbharti on 14/11/17.
 */
public class BasePage {

    protected static WebDriver driver;
    private String URL = "http://hotel-test.equalexperts.io/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(URL);
    }

    public WebElement waitForElement(WebDriver driver, final By by) {
        WebElement element;

        try {

            WebDriverWait wait = new WebDriverWait(driver, 15);
            element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
            return element;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
