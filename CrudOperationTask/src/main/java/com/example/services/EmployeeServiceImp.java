package com.example.services;
import java.util.List;
import java.util.Optional;

import com.example.repository.IEmployeeDao;
import com.example.entity.Employees;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService{

    @Autowired
    IEmployeeDao employeeDao;

    @Override
    public List<Employees> findAllEmployess(){
        return employeeDao.findAll();
    }

    public Employees createEmployee(Employees employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Optional<Employees> getById(int id) {
        Optional<Employees> emp = employeeDao.findById(id);
        return emp;
    }


    public Employees addEmpolyeeDetails(Employees emp){
        return employeeDao.save(emp);
    }

    public void deleteEmployee(int id) {
        employeeDao.deleteById(id);
    }

}
