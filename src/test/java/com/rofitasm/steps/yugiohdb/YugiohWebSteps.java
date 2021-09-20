package com.rofitasm.steps.yugiohdb;

import com.rofitasm.data.YugiohData;
import com.rofitasm.pages.yugioh.YugiohCardDetailsPage;
import com.rofitasm.pages.yugioh.YugiohCardSearchPage;
import com.rofitasm.pages.yugioh.YugiohHomePage;
import com.rofitasm.pages.yugioh.YugiohSearchResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static java.time.temporal.ChronoUnit.SECONDS;

public class YugiohWebSteps {

    YugiohCardDetailsPage yugiohCardDetailsPage;
    YugiohSearchResultsPage yugiohSearchResultsPage;
    YugiohCardSearchPage yugiohCardSearchPage;
    YugiohHomePage yugiohHomePage;

    YugiohData yugiohData = new YugiohData();

    @Given("open yugioh web home page")
    public void openYugiohWebHomePage() {
        yugiohHomePage.setImplicitTimeout(40,SECONDS);
        yugiohHomePage.open();
    }

    @And("open card search page")
    public void openCardSearchPage() {
        yugiohHomePage.clickCardSearchMenu();
    }

    @And("search {string} using search bar yugioh web")
    public void searchYugiohUsingSearchBarYugiohWeb(String value) {
        yugiohCardSearchPage.searchCard(value);
    }

    @And("open yugioh details page")
    public void openYugiohDetailsPage() {
        yugiohSearchResultsPage.openDetailsCardPage();
    }

    @When("get yugioh web data")
    public void getYugiohWebData() {
        yugiohData.setCardName("ok");
        yugiohData.setAtk(yugiohCardDetailsPage.getAtk());
        yugiohData.setDef(yugiohCardDetailsPage.getDef());
        yugiohData.setAttribute(yugiohCardDetailsPage.getAttribute());
        yugiohData.setCardEffects(yugiohCardDetailsPage.getCardEffects());
        yugiohData.setCardType(yugiohCardDetailsPage.getCardType());
        yugiohData.setMonsterType(yugiohCardDetailsPage.getMonsterType());
        yugiohData.setRank(yugiohCardDetailsPage.getRank());
    }
}
