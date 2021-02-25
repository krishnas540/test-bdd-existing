package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import implementations.UarkadmissionImpl;

public class UarkStepDefs {
    UarkadmissionImpl uarkadmission = new UarkadmissionImpl();

    @Given("^when I launch the uark website$")
    public void when_I_launch_the_uark_website() throws Throwable {
    uarkadmission.launchBrowser();
    uarkadmission.launchUarkwebsite();
    }

    @When("^I mouse hover on admissions$")
    public void I_mouse_hover_on_admissions() throws Throwable {
        uarkadmission.mouseHoverOnAdmission();
    }


    @When("^I click on admissions$")
    public void I_click_on_admissions() throws Throwable {
        uarkadmission.clickOnAdmissions();

        }

    @And("^I click on apply of admission$")
    public void I_click_on_apply_of_admission() throws Throwable {
uarkadmission.applyforAdmission();
    }

    @And("^I click on graduate application$")
    public void I_click_on_graduate_application() throws Throwable {
        uarkadmission.graduateApplication();

    }

    @And("^I click on start a new application$")
    public void I_click_on_start_a_new_application() throws Throwable {

    }

}
