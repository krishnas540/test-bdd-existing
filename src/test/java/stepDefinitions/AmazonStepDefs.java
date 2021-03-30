package stepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementations.AmazonImpl;

public class AmazonStepDefs {
    AmazonImpl amazonImpl = new AmazonImpl();


    @Given("^i launch the amazon website$")
    public void i_launch_the_amazon_website() throws Throwable {
        amazonImpl.launchAmazonWebsite();

    }

    @When("^i select the \"([^\"]*)\" from the search dropdown$")
    public void i_select_the_from_the_search_dropdown(String department) throws Throwable {
        amazonImpl.selectdepartment(department);

    }

    @Then("^i enter the product \"([^\"]*)\"$")
    public void i_enter_the_product(String productName) throws Throwable {
        amazonImpl.enterAProductName(productName);

    }

    @And("^i validate the product price$")
    public void i_validate_the_product_price() throws Throwable {
        amazonImpl.validateProductPrice();

    }
    @Given("^I mouse hover on rating and see the graph$")
    public void I_mouse_hover_on_rating_and_see_the_graph() throws Throwable {
        amazonImpl.mouseHoverOnRating();
    }
    @Given("^I select the brand \"([^\"]*)\", \"([^\"]*)\"$")
    public void I_select_the_brand(String brandName, String brandName2) throws Throwable {
        amazonImpl.selectABrand(brandName, brandName2);
    }

    @Given("^I navigate to gmail website$")
    public void I_navigate_to_gmail_website() throws Throwable {
        amazonImpl.gmailLaunch();
    }






}
