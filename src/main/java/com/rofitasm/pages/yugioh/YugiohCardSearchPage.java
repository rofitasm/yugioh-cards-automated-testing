package com.rofitasm.pages.yugioh;

import com.rofitasm.utils.UIUtility;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class YugiohCardSearchPage extends UIUtility {

    @FindBy(xpath = "//input[@id='keyword']")
    WebElementFacade cardSearchBox;

    public void searchCard(String value) {
        typeValue(cardSearchBox,value);
        cardSearchBox.sendKeys(Keys.ENTER);
    }
}
