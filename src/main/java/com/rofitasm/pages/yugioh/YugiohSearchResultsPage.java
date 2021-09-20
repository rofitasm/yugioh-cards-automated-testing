package com.rofitasm.pages.yugioh;

import com.rofitasm.utils.UIUtility;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class YugiohSearchResultsPage extends UIUtility {

    @FindBy(xpath = "//dt[@class='box_card_name']")
    WebElementFacade firstResultCard;

    public void openDetailsCardPage() {
        click(firstResultCard);
        switchNextTab();
    }
}
