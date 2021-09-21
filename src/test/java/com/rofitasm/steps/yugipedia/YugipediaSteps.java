package com.rofitasm.steps.yugipedia;

import com.rofitasm.data.YugiohData;
import com.rofitasm.pages.yugipedia.YugipediaCardDetailsPage;
import com.rofitasm.pages.yugipedia.YugipediaHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static java.time.temporal.ChronoUnit.SECONDS;

public class YugipediaSteps {

    public static YugiohData yugipediaData;

    YugipediaHomePage yugipediaHomePage;
    YugipediaCardDetailsPage yugipediaCardDetailsPage;

    @Given("open yugipedia web home page")
    public void openYugiohWebHomePage() {
        yugipediaHomePage.setImplicitTimeout(40,SECONDS);
        yugipediaHomePage.open();
    }

    @And("search {string} using search bar yugipedia web")
    public void searchYugiohUsingSearchBarYugiohWeb(String value) {
        yugipediaHomePage.searchCard(value);
    }

    @When("get yugipedia web data")
    public void getYugipediaWebData() {
        yugipediaData = new YugiohData();
        yugipediaData.setCardName(yugipediaCardDetailsPage.getCardName());
        yugipediaData.setAtk(yugipediaCardDetailsPage.getAtk());
        yugipediaData.setDef(yugipediaCardDetailsPage.getDef());
        yugipediaData.setAttribute(yugipediaCardDetailsPage.getAttribute());
        yugipediaData.setCardEffects(yugipediaCardDetailsPage.getCardEffects());
        yugipediaData.setCardType(yugipediaCardDetailsPage.getCardType());
        yugipediaData.setMonsterType(yugipediaCardDetailsPage.getMonsterType());
        yugipediaData.setRank(yugipediaCardDetailsPage.getRank());
    }
}
