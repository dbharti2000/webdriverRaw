package com.test.web;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by dbharti on 14/11/17.
 */
public class GoogleStepDefs {

    protected WebDriver driver;
    private static GoogleHomePage page;

    @Before
    public void beforeScenario(){
        driver = new ChromeDriver();
        System.out.println("Set-up before the scenario");
    }

    @After
    public void afterScenario(){
        driver.quit();
    }

    @Given("^I navigate to elsevier homepage$")
    public void i_navigate_to_elsevier_homepage() throws Throwable {
        page = new GoogleHomePage(driver);
        page.open();
    }

    @When("^I check the title$")
    public void i_check_the_title() throws Throwable {
        //page.deleteBooking();
        page.returnTitle();
    }

    @Then("^I should get the title \"([^\"]*)\"$")
    public void i_should_get_the_title(String arg1) throws Throwable {
        assertTrue(page.returnTitle().equalsIgnoreCase("Hotel booking form"));
    }

}
