package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Utility {
    @CacheLookup
    @FindBy(id = "Capa_1")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='searchBar']/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement searchField;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='searchBar']/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]")
    WebElement selectGameName;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Double Bubble')]")
    WebElement verifyName;

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public void sendTextToSearchField(String text) {
        sendTextToElement(searchField, text);
    }

    public void selectGameName() {
        clickOnElement(selectGameName);
    }

    public String verifyDoubleBubbleText() {
        return getTextFromElement(verifyName);
    }
}
