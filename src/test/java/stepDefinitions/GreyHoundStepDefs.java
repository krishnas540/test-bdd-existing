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

    /*login-validation*/
    @When("^i enter user name \"([^\"]*)\"$")
    public void i_enter_user_name(String userName) throws Throwable {
        greyHound.enterUserName(userName);
    }

    @When("^i Enter password \"([^\"]*)\"$")
    public void i_Enter_password(String password) throws Throwable {
        greyHound.enterPassword(password);
    }


    @Then("^click on the Go$")
    public void click_on_the_Go() throws Throwable {
        greyHound.clickToLogin();

    }

    @Then("^i validate the login \"([^\"]*)\"$")
    public void i_validate_the_login(String status) throws Throwable {
        greyHound.logInStatus(status);

    }



    @When("^i enter from \"([^\"]*)\"$")
    public void i_enter_from(String from) throws Throwable {
        greyHound.enterfromlocation(from);

    }

    @When("^i enter to \"([^\"]*)\"$")
    public void i_enter_to(String to) throws Throwable {
        greyHound.entertolocation(to);
    }

    @Then("^Enter Depart on Date \"([^\"]*)\"$")
    public void Enter_Depart_on_Date(String ddate) throws Throwable {
        greyHound.enterddate(ddate);
    }

    @Then("^Enter return date \"([^\"]*)\"$")
    public void Enter_return_date(String rdate) throws Throwable {
        greyHound.enterrdate(rdate);
    }

    @Then("^i click on search$")
    public void i_click_on_search() throws Throwable {
        greyHound.clicktosearchtrip();

    }

    @Then("^I validate trip details \"([^\"]*)\"$")
    public void I_validate_trip_details(String message) throws Throwable {
            greyHound.validateTripDetailMessage(message);

    }



}
