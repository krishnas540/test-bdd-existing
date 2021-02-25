package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementations.GetEmployeesImpl;

public class GetEmployeesAPIStepDefs {
    GetEmployeesImpl getEmployees = new GetEmployeesImpl();
    @When("^I make a get call to the employees service$")
    public void I_make_a_get_call_to_the_employees_service() throws Throwable {
        System.out.println("I'm in step one");
        getEmployees.getEmployeesInfo();


    }

    @Then("^I validate the employees info$")
    public void I_validate_the_employees_info() throws Throwable {

    }


    @When("^I make a post call to the create an employee service for given data \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_make_a_post_call_to_the_create_an_employee_service_for_given_data_and(String name, String salary, String age) throws Throwable {
       getEmployees.createAnEmplee(name,salary,age);
    }




    @When("^I make a put call to the update an empolyee service$")
    public void I_make_a_put_call_to_the_update_an_empolyee_service() throws Throwable {
       getEmployees.updateanempolyee();
    }

}
