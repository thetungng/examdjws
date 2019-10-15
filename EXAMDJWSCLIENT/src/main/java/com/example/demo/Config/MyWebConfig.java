package com.example.demo.Config;

import com.example.demo.Service.EmployeesService.EmployeesService;
import com.example.demo.Service.EmployeesService.EmployeesServiceServiceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.rpc.ServiceException;

@Configuration
public class MyWebConfig {
    @Bean
    EmployeesService employeesService() throws ServiceException {
        return new EmployeesServiceServiceLocator().getEmployeesServicePort();
    }
}
