package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.SlotsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PageSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I can click on online slots$")
    public void iCanClickOnOnlineSlots() {
        new HomePage().clickOnAcceptButton();
        new HomePage().clickOnOnlineSlots();
    }

    @Then("^I can verify \"([^\"]*)\" text$")
    public void iCanVerifyText(String expectedText) {
        Assert.assertEquals("Play Online Slots at Virgin Games is not displayed",expectedText,new SlotsPage().getPlayOnlineText());
    }
}
