package testNG;

import implementations.GetEmployeesImpl;
import org.junit.Test;

public class TestNgapiautomation {
    GetEmployeesImpl getEmployees = new GetEmployeesImpl();

    @Test
    public void I_make_a_get_call_to_the_employees_service() throws Throwable {
        System.out.println("I'm in step one");
        getEmployees.getEmployeesInfo();


    }
}
