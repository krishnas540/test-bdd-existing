package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementations.PracticeImpl;

public class PracticeStepDefs {

    PracticeImpl practiceImpl= new PracticeImpl();
 /*   @Given("^i launch the automation practice website$")
    public void i_launch_the_automation_practice_website() throws Throwable {
        practiceImpl.launchAmazonPractoceWebsite();

    }

    @When("^i select the \"([^\"]*)\"$")
    public void i_select_the(String signin) throws Throwable {
        practiceImpl.selectsignin();
    }

    @Then("^i enter Valid \"([^\"]*)\"$")
    public void i_enter_Valid(String email) throws Throwable {
        practiceImpl.enteremail(email);

    }

   @And("^i click on \"([^\"]*)\"$")
    public void i_click_on(String account) throws Throwable {
        practiceImpl.account();
    }

*/
    @Given("^I Launch Practice website$")
    public void iLaunchPracticeWebsite() {
        practiceImpl.launchapplication();
    }


    @When("^I click on signin$")
    public void iClickOnSignin() {
        practiceImpl.clickOnSignin();
        
    }

    @Then("^I enter email  \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws Throwable {
        practiceImpl.enteremail(email);

    }

    @And("^I click create an account$")
    public void iClickCreateAnAccount() {
        practiceImpl.clickOnCreateAccount();
    }
}
