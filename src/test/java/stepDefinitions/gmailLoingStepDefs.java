package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import implementations.Gmaillogin;

public class gmailLoingStepDefs {
    Gmaillogin gmaillogin = new Gmaillogin();

    @Given("^I launch the gmail application$")
    public void I_launch_the_gmail_application() throws Throwable {
        gmaillogin.launchBrowser();
        gmaillogin.launchGmailapp();

    }

    @When("^I click on userName$")
    public void I_click_on_userName() throws Throwable {
        gmaillogin.enterUserID();


    }
    @And("^I click on next button$")
    public void I_click_on_next_button() throws Throwable {
    gmaillogin.clickOnNextButton();
    }


}
