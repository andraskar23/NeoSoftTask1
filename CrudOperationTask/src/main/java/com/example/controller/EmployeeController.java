package com.example.controller;

import com.example.entity.Employees;
import com.example.services.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @DeleteMapping("{/id}")
    public ResponseEntity<?> deleteEmployee(int id){
boolean deletedEmp=employeeService.deleteemployee(id);

if(deletedEmp){
    return  ResponseEntity.ok("Employee No "+id +"Deleted Successfully.");

}
else return ResponseEntity.ofNullable(id);

    }


}