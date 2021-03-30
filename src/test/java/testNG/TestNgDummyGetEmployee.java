package testNG;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.response.ValidatableResponse;
import implementations.GetEmployeesImpl;
import implementations.apiImpl.GetDummyImpl;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;

public class TestNgDummyGetEmployee {
    GetDummyImpl getDummyImpl = new GetDummyImpl();
    ValidatableResponse dummyEmployeeResponse;

    @Test
    public void getDummyEmployeeGetCallValidationAgainstDB() throws Throwable {
        /*step1: making a getEmpl call*/
        String id = "1";
        dummyEmployeeResponse = getDummyImpl.getDummyEmployeeCall(id);
        System.out.println("response status code is: "+dummyEmployeeResponse.extract().statusCode());
        Assert.assertEquals(200, dummyEmployeeResponse.extract().statusCode());
        System.out.println("response body  is: "+dummyEmployeeResponse.extract().body().asString());
        Assert.assertTrue(dummyEmployeeResponse.extract().body().asString().contains("Tiger Nixon"));

        /*step2: vlidate service response against database*/
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


}


