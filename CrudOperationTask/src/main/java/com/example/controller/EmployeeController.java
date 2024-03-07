package com.example.controller;

import com.example.entity.Employees;
import com.example.services.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
