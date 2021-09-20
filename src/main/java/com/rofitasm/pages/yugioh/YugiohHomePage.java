package com.rofitasm.pages.yugioh;

import com.rofitasm.utils.UIUtility;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.db.yugioh-card.com/yugiohdb/")
public class YugiohHomePage extends UIUtility {

    @FindBy(xpath = "//a[@class='cards']")
    WebElementFacade cardSearchMenu;

    public void clickCardSearchMenu() {
        click(cardSearchMenu);
    }

}
