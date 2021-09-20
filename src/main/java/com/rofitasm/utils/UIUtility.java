package com.rofitasm.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class UIUtility extends PageObject {

    protected void hover(WebElementFacade webElementFacade) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(webElementFacade).build().perform();
    }

    protected void click(WebElementFacade webElementFacade) {
        waitFor(webElementFacade);
        webElementFacade.click();
    }

    protected List <String> getStringListFromElements(List<WebElementFacade> webElementFacades) {
        List<String> stringList = new ArrayList<>();
        for (WebElementFacade w : webElementFacades) {
            stringList.add(w.getText());
        }
        return stringList;
    }

    protected void typeValue(WebElementFacade webElementFacade, String value) {
        waitFor(webElementFacade);
        webElementFacade.type(value);
    }

    protected void switchNextTab() {
        ArrayList<String> tabs = new ArrayList(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
    }

}
