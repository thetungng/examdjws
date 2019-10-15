package example;

import example.Service.EmployeesService;

import javax.xml.ws.Endpoint;

public class MainApplication {
    public static void main(String[] argv) {
        String employeesService = "http://localhost:9000/employees_service";
        Endpoint.publish(employeesService, new EmployeesService());
    }
}
