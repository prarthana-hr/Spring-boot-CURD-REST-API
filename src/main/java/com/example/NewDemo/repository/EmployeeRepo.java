package com.example.NewDemo.repository;

import com.example.NewDemo.entiry.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //it helps us to perform curd operation on entity from db, it has methods supported.
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


}
