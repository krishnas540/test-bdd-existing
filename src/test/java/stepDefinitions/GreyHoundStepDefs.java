package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementations.GreyHoundImpl;

public class GreyHoundStepDefs {
    GreyHoundImpl greyHound = new GreyHoundImpl();

    @Given("^I launch the greyhound website$")
    public void I_launch_the_greyhound_website() throws Throwable {
        greyHound.launchTheapplication();
    }

    @When("^I click on the book a trip$")
    public void I_click_on_the_book_a_trip() throws Throwable {
        greyHound.clickOnBookaTrip();

    }

    @And("^I click on the booknow$")
    public void I_click_on_the_booknow() throws Throwable {
        greyHound.bookNow();

    }

    @Then("^I validate the booking template$")
    public void I_validate_the_booking_template() throws Throwable {
        greyHound.bookingTemplate();
    }
    @And("^I close the browser successfully$")
    public void I_close_the_browser_successfully() throws Throwable {
        greyHound.closeBrowser();
    }


}
