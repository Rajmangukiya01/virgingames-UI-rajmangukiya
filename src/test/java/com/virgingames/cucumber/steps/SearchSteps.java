package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.SearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchSteps {
    @When("^I click on search button$")
    public void iClickOnSearchButton() {
         new HomePage().clickOnAcceptButton();
         new SearchPage().clickOnSearchButton();
    }

    @And("^I can enter name \"([^\"]*)\" of the game$")
    public void iCanEnterNameOfTheGame(String text) {
        new SearchPage().sendTextToSearchField(text);
    }

    @And("^I can select a game$")
    public void iCanSelectAGame() {
        new SearchPage().selectGameName();
    }

    @Then("^I can verify the game name \"([^\"]*)\"$")
    public void iCanVerifyTheGameName(String text) {
        Assert.assertEquals("Double bubble is not displayed",text,new SearchPage().verifyDoubleBubbleText());
    }
}
