//package com.example.NewDemo.controllerTest;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import com.example.NewDemo.controller.EmployeeAPI;
//import com.example.NewDemo.entiry.Employee;
//import com.example.NewDemo.repository.EmployeeRepo;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@TestConfiguration
//@WebAppConfiguration
//@ActiveProfiles("apiTest")
//@SpringBootTest(classes = EmployeeAPI.class)
//public class apiTest {
//    @LocalServerPort//it takes prod server port i.e 8081
//    private int port;
//
//    @MockBean
//    private EmployeeRepo employeeRepo;
//
//    @Autowired //this acts as repo
//    private TestRestTemplate testRestTemplate;
//
//
//
//
//
//    @Test
//    public void getAllEmp(){
//        ResponseEntity<Employee> responseEntity=testRestTemplate.getForEntity("/api/emp", Employee.class);
//        when(employeeRepo.findAll()).thenReturn(employee());
//        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
//
//
//    }
//
//    public List<Employee> employee(){
//        List<Employee> employeeList = new ArrayList<>();
//        Employee employee = new Employee();
//        employee.setMobileno(3456789);
//        employee.setLastname("yfde");
//        employee.setFirstname("hjcbdiu");
//        employee.setEmail("sdftyui");
//        employeeList.add(employee);
//        return employeeList;
//    }
//
//
//}
