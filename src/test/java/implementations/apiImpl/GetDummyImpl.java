package implementations.apiImpl;

import Utils.MySQLDBConnection;
import Utils.RestAssuredMethods;
import com.jayway.restassured.response.ValidatableResponse;

import java.sql.ResultSet;
import java.util.HashMap;

public class GetDummyImpl {
    ValidatableResponse dummyEmployeeResponse,dummyPostEmployeeResponse,dummyPutEmployeeResponse;
    RestAssuredMethods restAssuredMethods = new RestAssuredMethods();
    MySQLDBConnection mySQLDBConnection = new MySQLDBConnection();
    public ValidatableResponse getDummyEmployeeCall(String id) throws Throwable {
        String host = "http://dummy.restapiexample.com";
        String endpoint = "/api/v1/employees";
        dummyEmployeeResponse= restAssuredMethods.getCall(host,endpoint);
        return dummyEmployeeResponse;

    }

    public ValidatableResponse postDummyCall() throws Throwable {
        String host ="http://dummy.restapiexample.com";
        String endpoint="/api/v1/create";
        String body="{\"name\":\"Saurabh\",\"salary\":\"123450\",\"age\":\"31\"}";
        dummyPostEmployeeResponse=restAssuredMethods.postCall(host,endpoint,body);
        return dummyPostEmployeeResponse;
    }

    public ValidatableResponse putDummyCall() throws Throwable {
        String host="http://dummy.restapiexample.com/";
        String endpoint="/public/api/v1/update/21";
        String body="{\"name\":\"Saurabh\",\"salary\":\"124450\",\"age\":\"31\"}";
        dummyPutEmployeeResponse=restAssuredMethods.putCall(host,endpoint,body);
        return dummyPutEmployeeResponse;
    }

    public ResultSet getDbresult(String query) throws Exception {
        ResultSet resultSet =  mySQLDBConnection.mySqldbconnection(query);
        return  resultSet;

    }
}
