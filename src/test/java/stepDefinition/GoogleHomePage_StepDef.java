package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.GoogleHomePage;

public class GoogleHomePage_StepDef {
    @Given("User navigates to google URL")
    public void userNavigatesToGoogleURL() {
        GoogleHomePage.navigateToGoogleHomePage();
    }

    @When("User successfully navigated")
    public void userSuccessfullyNavigated() {

    }
    @Then("User should see google logo icon displayed")
    public void userShouldSeeGoogleLogoIconDisplayed() {
        GoogleHomePage.validateThatGoogleLogoIconExists();
    }
}
