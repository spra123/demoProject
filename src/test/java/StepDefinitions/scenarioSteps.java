package StepDefinitions;

import Pages.scenarios;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenarioSteps {
    @Given("user clicks on the given link")
    public void given_link(){
        scenarios.launchApp();
    }
    @Given("user clicks on the dropdown")
        public void dropDown(){
            scenarios.clickondropdown();
        }
    @When("user selects given option")
    public void givenoption(){
        scenarios.selectGivenoption();
        }
    @Then("user clicks on get started")
    public void getstarted(){
        scenarios.getStarted();
    }
    @And("user clicks on the search button")
    public void searchbutton(){
        scenarios.searchbutton();
    }
    @Then("user enters any {string}")
        public void user_enters_with(String string)  {
            scenarios.entersTopic(string);
    }
    @Then("user closes browser window")
     public void closeWindow(){
        scenarios.quitBrowser();
    }
    }

