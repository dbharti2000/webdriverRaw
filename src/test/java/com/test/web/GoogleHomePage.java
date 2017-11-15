package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by dbharti on 14/11/17.
 */
public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public String returnTitle() {
        return driver.getTitle();
    }

    public String returnFirstDeleteId() {
        WebElement firstBooking = driver.findElement(By.xpath("//div[@id='bookings']/div[2]"));
        assertNotNull("", firstBooking);
        return firstBooking.getAttribute("id").toString();
    }

    public void deleteBooking() {
        String bookingId = returnFirstDeleteId();
        WebElement firstButton = waitForElement(driver, By.xpath("//div[@id='bookings']/div[2]/div/input[@value='Delete']"));
        firstButton.click();
        assertTrue( driver.findElements(By.id(bookingId)).size() ==0);
    }
}
