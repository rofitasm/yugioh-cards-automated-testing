package com.rofitasm.pages.yugioh;

import com.rofitasm.utils.UIUtility;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static com.rofitasm.utils.DataProcessUtility.filterAlphabets;

public class YugiohCardDetailsPage extends UIUtility {

    @FindBy(xpath = "//header[@id='broad_title']//h1")
    WebElementFacade cardNameField;

    @FindBy(xpath = "//span[@class='item_box_title']/b[text()='ATK']//parent::*/following-sibling::*[1]")
    WebElementFacade atkField;

    @FindBy(xpath = "//span[@class='item_box_title']/b[text()='DEF']//parent::*/following-sibling::*")
    WebElementFacade defField;

    @FindBy(xpath = "//span[@class='item_box_title']/b[text()='Attribute']/parent::*/following-sibling::*")
    WebElementFacade attributeField;

    @FindBy(xpath = "//span[@class='item_box_title']/b[text()='Level']/parent::*/following-sibling::*")
    WebElementFacade rankField;

    @FindBy(xpath = "//span[@class='item_box_title']/b[text()='Monster Type']/parent::*/parent::*")
    WebElementFacade monsterTypeField;

    @FindBy(xpath = "//span[@class='item_box_title']/b[text()='Card Type']/parent::*/parent::*")
    WebElementFacade cardTypeField;

    @FindBy(xpath = "//div[@class='item_box_title']/b[text()='Card Text']/parent::*/parent::*")
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
