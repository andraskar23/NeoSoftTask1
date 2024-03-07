package com.example.Controller;

import com.example.Pojo.Employees;
import com.example.serviceImpl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

   @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmp")
    public List<Employees> getAllEmployees(){

        return employeeService.findAllEmployess();
    }


}
