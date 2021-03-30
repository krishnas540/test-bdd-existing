package stepDefinitions.apiStepDefinitions;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.response.ValidatableResponse;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementations.apiImpl.GetDummyImpl;
import org.junit.Assert;
import org.openqa.selenium.json.Json;

import java.sql.ResultSet;

public class DummyGetCallStepDefs {
    GetDummyImpl getDummyImpl = new GetDummyImpl();
    ValidatableResponse dummyEmployeeResponse, dummyPostEmployeeResponse,dummyPutEmployeeResponse;

    @When("^I make a get call to the dummy employees service \"([^\"]*)\", (\\d+), \"([^\"]*)\"$")
    public void I_make_a_get_call_to_the_dummy_employees_service_(String id, int statusCode, String acceptanceCriteria) throws Throwable {
        dummyEmployeeResponse = getDummyImpl.getDummyEmployeeCall(id);
        System.out.println("response status code is: "+dummyEmployeeResponse.extract().statusCode());
        Assert.assertEquals(statusCode, dummyEmployeeResponse.extract().statusCode());
        System.out.println("response body  is: "+dummyEmployeeResponse.extract().body().asString());
        Assert.assertTrue(dummyEmployeeResponse.extract().body().asString().contains(acceptanceCriteria));


    }

    @Then("^I validate the employees info for dummy$")
    public void I_validate_the_employees_info_for_dummy() throws Throwable {
       // Assert.assertTrue(dummyEmployeeResponse.extract().body().asString().contains("Tiger Nixon"));



        /*database validation*/
        String query ="select * from employee;";
         ResultSet getDbResult =getDummyImpl.getDbresult(query);
         int i=0;
         while (getDbResult.next()){
             DocumentContext jsonPath = JsonPath.parse(dummyEmployeeResponse.extract().body().asString());
             String jsalary =jsonPath.read("$.data.[?(@.id=='"+(i+1)+"')].employee_salary").toString().replace("[", "").replace("]","").replace("\"","");
             String jename =jsonPath.read("$.data.[?(@.id=='"+(i+1)+"')].employee_name").toString().replace("[", "").replace("]","").replace("\"","");
             String jage =jsonPath.read("$.data.[?(@.id=='"+(i+1)+"')].employee_age").toString().replace("[", "").replace("]","").replace("\"","");

             int dbemployeeId = getDbResult.getInt("id");
             String dbemployeeName = getDbResult.getString("ename");
             String dbemployeeSalary = getDbResult.getString("salary");
             String dbemployeeAge = getDbResult.getString("age");
             System.out.println("empID: " + dbemployeeId + " , empName: " + dbemployeeName + " , empSalary: " + dbemployeeSalary+ " ,empAge: " + dbemployeeAge);

             Assert.assertEquals(jename,dbemployeeName );
             Assert.assertEquals(jsalary,dbemployeeSalary );
             Assert.assertEquals(jage,dbemployeeAge );
             System.out.println("Validated data for employeeName: " + jename);
              i++;
         }

    }

    @When("^I make a post call to the dummy employees service$")
    public void I_make_a_post_call_to_the_dummy_employees_service() throws Throwable {
        dummyPostEmployeeResponse = getDummyImpl.postDummyCall();
        Assert.assertEquals(200, dummyPostEmployeeResponse.extract().statusCode());

    }

    @Then("^I validate the employees info for dummy post service$")
    public void I_validate_the_employees_info_for_dummy_post_service() throws Throwable {

    }

    @When("^I make a put call to the dummy employees service$")
    public void I_make_a_put_call_to_the_dummy_employees_service() throws Throwable {
        dummyPutEmployeeResponse=getDummyImpl.putDummyCall();

    }

    @Then("^I validate the employees info for dummy put service$")
    public void I_validate_the_employees_info_for_dummy_put_service() throws Throwable {

    }


}
