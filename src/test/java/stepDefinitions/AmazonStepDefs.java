package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import implementations.AmazonImpl;

public class AmazonStepDefs {
    AmazonImpl amazonimpl = new AmazonImpl();

    @Given("^I launch the amazon website$")
    public void I_launch_the_amazon_website() throws Throwable {
        amazonimpl.lauchTheAmazonapp();


    }

    @When("^I mouse hover on flag, select the language$")
    public void I_mouse_hover_on_flag_select_the_language() throws Throwable {
amazonimpl.clickonLinkText();

    }
}
