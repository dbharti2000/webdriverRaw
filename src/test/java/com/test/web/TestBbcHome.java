package com.test.web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.*;

public class TestBbcHome {

    WebDriver driver;
    private static String URL = "http://bbc.co.uk";
    private static String SPORTS_TITLE = "Home - BBC Sport";
    private static String HOMEPAGE_TITLE = "BBC - Home";

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }


    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testBbcHome() {
        driver.get(URL);
        assertThat(driver.getTitle(), equalToIgnoringCase(HOMEPAGE_TITLE));
        driver.findElement(By.cssSelector("#orb-nav-links ul li:nth-child(3)")).click();
        //driver.findElements(By.cssSelector("#orb-nav-links ul li")).get(3).click();

        assertThat(driver.getTitle(), equalToIgnoringCase(SPORTS_TITLE));


    }
}
