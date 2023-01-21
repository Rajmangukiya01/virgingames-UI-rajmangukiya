package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SlotsPage extends Utility {
    private static final Logger log = LogManager.getLogger(SlotsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Play Online Slots at Virgin Games')]")
    WebElement playOnlineText;

    public String getPlayOnlineText(){
        log.info("Verify the text Play Online Slots at Virgin Games : " + playOnlineText.toString());
        return getTextFromElement(playOnlineText);
    }
}
