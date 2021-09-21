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

public class YugiohdbSteps {

    public static YugiohData yugiohdbData;

    YugiohHomePage yugiohHomePage;
    YugiohCardDetailsPage yugiohCardDetailsPage;
    YugiohSearchResultsPage yugiohSearchResultsPage;
    YugiohCardSearchPage yugiohCardSearchPage;

    @Given("open yugioh web home page")
    public void openYugiohWebHomePage() {
        yugiohHomePage.setImplicitTimeout(40,SECONDS);
        yugiohHomePage.open();
    }

    @And("open card search page")
    public void openCardSearchPage() {
        yugiohHomePage.clickCardSearchMenu();
    }

    @And("search {string} using search bar yugiohdb")
    public void searchYugiohUsingSearchBarYugiohdb(String value) {
        yugiohCardSearchPage.searchCard(value);
    }

    @And("open yugioh details page")
    public void openYugiohDetailsPage() {
        yugiohSearchResultsPage.openDetailsCardPage();
    }

    @When("get yugiohdb web data")
    public void getYugiohdbWebData() {
        yugiohdbData = new YugiohData();
        yugiohdbData.setCardName(yugiohCardDetailsPage.getCardName());
        yugiohdbData.setAtk(yugiohCardDetailsPage.getAtk());
        yugiohdbData.setDef(yugiohCardDetailsPage.getDef());
        yugiohdbData.setAttribute(yugiohCardDetailsPage.getAttribute());
        yugiohdbData.setCardEffects(yugiohCardDetailsPage.getCardEffects());
        yugiohdbData.setCardType(yugiohCardDetailsPage.getCardType());
        yugiohdbData.setMonsterType(yugiohCardDetailsPage.getMonsterType());
        yugiohdbData.setRank(yugiohCardDetailsPage.getRank());
    }
}
