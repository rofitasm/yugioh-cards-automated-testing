package com.rofitasm.pages.yugipedia;

import com.rofitasm.utils.UIUtility;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static com.rofitasm.utils.DataProcessUtility.cleanHtmlTags;
import static com.rofitasm.utils.DataProcessUtility.filterAlphabets;

public class YugipediaCardDetailsPage extends UIUtility {

    @FindBy(xpath = "//div[@class='heading']")
    WebElementFacade cardNameField;

    @FindBy(xpath = "//a[contains(@title,'ATK Monster Cards')]")
    WebElementFacade atkField;

    @FindBy(xpath = "//a[contains(@title,'DEF Monster Cards')]")
    WebElementFacade defField;

    @FindBy(xpath = "//a[@title='Attribute']/parent::*/following-sibling::*/a[1]")
    WebElementFacade attributeField;

    @FindBy(xpath = "//a[@title='Level']/parent::*/following-sibling::*/a[1]")
    WebElementFacade rankField;

    @FindBy(xpath = "//a[@title='Type']/parent::*/following-sibling::*/a[1]")
    WebElementFacade monsterTypeField;

    @FindBy(xpath = "//a[@title='Type']/parent::*/following-sibling::*/a[2]")
    WebElementFacade cardTypeField;

    @FindBy(xpath = "//div[@class='lore']//i")
    WebElementFacade cardEffectField;

    public String getCardName() {
        return filterAlphabets(cardNameField.getText().toLowerCase());
    }

    public int getAtk() {
        return Integer.parseInt(atkField.getText());
    }

    public int getDef() {
        return Integer.parseInt(defField.getText());
    }

    public String getAttribute() {
        return filterAlphabets(attributeField.getText().toLowerCase());
    }

    public String getCardEffects() {
        return cardEffectField.getText().toLowerCase();
    }

    public String getCardType() {
        return filterAlphabets(cardTypeField.getText().toLowerCase());
    }

    public String getMonsterType() {
        return filterAlphabets(monsterTypeField.getText().toLowerCase());
    }

    public int getRank() {
        return Integer.parseInt(rankField.getText());
    }

}
