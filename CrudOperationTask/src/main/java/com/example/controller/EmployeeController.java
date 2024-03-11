package com.example.controller;

import com.example.entity.Employees;
import com.example.services.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

   @Autowired
   EmployeeServiceImp employeeService;

    @GetMapping("/getEmp")
    public List<Employees> getAllEmployees(){

        return employeeService.findAllEmployess();
    }

    @PostMapping("insertemp")
    public ResponseEntity<Employees> createEmployee(@RequestBody Employees employee) {
        Employees createdEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }


}
