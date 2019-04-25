package com.example.demo.repositories;

import com.example.demo.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
