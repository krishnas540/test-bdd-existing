package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementations.DeleteEmpolyeeserviceIMPL;

public class DeleteEmployeeserviceStepDef {
    DeleteEmpolyeeserviceIMPL deleteEmpolyeeserviceIMPL = new DeleteEmpolyeeserviceIMPL();

    @When("^i make a delete call to theDelete Employee service (\\d+)$")
    public void i_make_a_delete_call_to_theDelete_Employee_service(int employeeId) throws Throwable {
        deleteEmpolyeeserviceIMPL.deleteempolyeeserivecall(employeeId);
    }

    @Then("^I validate the response \"([^\"]*)\"$")
    public void I_validate_the_response(String status) throws Throwable {
        deleteEmpolyeeserviceIMPL.validatetheResponse(status);

    }
}
