package com.example.NewDemo.controller;

import com.example.NewDemo.entiry.Employee;
import com.example.NewDemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController//tells it is a rest api
@RequestMapping("/api")
public class EmployeeAPI {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/emp")//list
    public List<Employee> getAllEmp() {
        return employeeRepo.findAll();
    }

    //is JSON to java objects__>@RequestBody(incoming request)
    //java objects to json-->@ResponseBody(outgoing response)
    @PostMapping("/emp")//insert
    public Employee createEmp(@RequestBody Employee employee) {
        return employeeRepo.save(employee);

    }

    //@PathVariable says api id is same as that of passed parameter id
    @GetMapping("/emp/{id}")//search
    public Employee getEmpById(@PathVariable Integer id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found given id " + " " + id));
        //return ResponseEntity.ok(employee);

    }

    @PutMapping("/emp/{id}")//update
    public Employee updateEmp(@PathVariable Integer id, @RequestBody Employee employees) {
        Employee e1 = employeeRepo.findById(id).orElseThrow(() -> new RuntimeException("Not found thr given id " + " " + id));

        e1.setEmail(employees.getEmail());
        e1.setFirstname(employees.getFirstname());
        e1.setLastname(employees.getLastname());
        e1.setMobileno(employees.getMobileno());

        return employeeRepo.save(e1);
    }

    @DeleteMapping("/emp/{id}")
    public boolean deleteEmp(@PathVariable Integer id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> new RuntimeException("id not found" + " " + id));

        employeeRepo.delete(employee);
        return true;

    }
}
