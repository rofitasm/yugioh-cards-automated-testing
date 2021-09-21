package com.rofitasm.pages.yugipedia;

import com.rofitasm.utils.UIUtility;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("https://yugipedia.com/wiki/Yugipedia")
public class YugipediaHomePage extends UIUtility {

    @FindBy(xpath = "//input[@name='search']")
    WebElementFacade searchBar;

    public void searchCard(String value) {
        typeValue(searchBar,value);
        searchBar.sendKeys(Keys.ENTER);
    }

}
