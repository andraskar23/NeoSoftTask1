package com.example.controller;

import com.example.entity.Employees;
import com.example.services.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

   @Autowired
   EmployeeServiceImp employeeService;

    @GetMapping("/getEmp")
    public ResponseEntity<?> getAllEmployees(){
        List<Employees> list = employeeService.findAllEmployess();
        if(!list.isEmpty())
        {
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        return new ResponseEntity<>("No Records Found...",HttpStatus.OK);
    }

    @GetMapping("/getEmpById/{id}")
    public ResponseEntity<?> getEmpById(@PathVariable int id){
        Optional<Employees> emp = employeeService.getById(id);
        if(emp == null)
        {
            return new ResponseEntity<>("Employee Not Found...", HttpStatus.OK);

        }
        return new ResponseEntity<>(emp,HttpStatus.OK);
    }


    @PutMapping("/update")
    public Employees updateEmployeeDetails(@RequestBody Employees updateEmp ){
        return employeeService.addEmpolyeeDetails(updateEmp);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee No " + id + "Deleted Successfully.");

    }
    @PostMapping("/insertEmp")
    public ResponseEntity<Employees> createEmployee(@RequestBody Employees employee) {
        Employees createdEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }




}
