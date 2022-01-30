package com.theScore.stepDefs;

import com.theScore.pages.BostonCelticsTeamPage;
import com.theScore.pages.FavoritesMainPage;
import com.theScore.pages.LogInPage;
import com.theScore.utils.Driver;
import com.theScore.utils.MobileUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BostonCelticsStepDefs {
    LogInPage logInPage = new LogInPage();
    FavoritesMainPage favoritesMainPage = new FavoritesMainPage();
    BostonCelticsTeamPage bostonCelticsTeamPage = new BostonCelticsTeamPage();

    @Given("user connects to the server and starts the application")
    public void userConnectsToTheServerAndStartsTheApplication() {
        Driver.getDriver();

        System.out.println("Application is on");
    }

    @When("user continues to favorite team page")
    public void userContinuesToFavoriteTeamPageAndSelectsATeam() {
        logInPage.continuWithoutSignIn();
        MobileUtils.waitFor(3000);
    }

    @And("user clicks {string} tab from modules")
    public void userClicksTabFromModules(String NBA) {

        favoritesMainPage.teams("NBA");
    }

    @And("user selects {string} as a favorite team and continue to next page")
    public void userSelectsAsAFavoriteTeamAndContinueToNextPage(String arg0) {
        favoritesMainPage.nbaTeams("Boston Celtics");
        favoritesMainPage.toFavsPage();

    }

    @And("user clicks into newly added favorite team page")
    public void userClicksIntoNewlyAddedFavoriteTeamPage() {
        bostonCelticsTeamPage.toBostonCelticsMainPage();
    }

    @Then("user verifies the page with team name {string}")
    public void userVerifiesThePageWithTeamName(String arg0) {
        String team = bostonCelticsTeamPage.teamName.getText();
        Assertions.assertEquals("Boston Celtics", team);

    }

    @Then("user clicks {string} module and selects the {string}")
    public void userClicksModuleAndVerifiesThe(String playerStats, String bestPlayer) {
        bostonCelticsTeamPage.playerStatsTab.click();
        bostonCelticsTeamPage.bestPlayer.click();

    }

    @Then("user successfully sees the best player's information")
    public void theUserVerifiesThePlayer() {
        String name = bostonCelticsTeamPage.bestPlayerName.getText();
        String expectedName = "Jayson Tatum";
        Assertions.assertEquals(expectedName, name);

        System.out.println("Awesome Test Passed !");

    }
}
