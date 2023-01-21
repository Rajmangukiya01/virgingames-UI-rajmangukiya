package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Slots')]")
    WebElement onlineSlots;

    @CacheLookup
    @FindBy(xpath = "//label[text()=' Accept']")
    WebElement acceptButton;

    public void clickOnOnlineSlots(){
        log.info("Click on online slots option : " + onlineSlots.toString());
        clickOnElement(onlineSlots);
    }

    public void clickOnAcceptButton(){
        log.info("Click on accept button : " + acceptButton.toString());
        clickOnElement(acceptButton);
    }

}
