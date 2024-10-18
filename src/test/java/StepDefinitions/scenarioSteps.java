package StepDefinitions;

import Pages.homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenarioSteps {
    @Given("user clicks on the given link")
    public void given_link(){
        homepage.launchApp();
    }
    @Given("user clicks on the dropdown")
        public void dropDown(){
            homepage.clickondropdown();
        }
    @When("user selects given option")
    public void givenoption(){
        homepage.selectGivenoption();
        }
    @Then("user clicks on get started")
    public void getstarted(){
        homepage.getStarted();
    }
    @And("user clicks on the search button")
    public void searchbutton(){
        homepage.searchbutton();
    }
    @Then("user enters any {string}")
        public void user_enters_with(String string)  {
            homepage.entersTopic(string);
    }
    @Then("user closes browser window")
     public void closeWindow(){
        homepage.quitBrowser();
    }
    }

