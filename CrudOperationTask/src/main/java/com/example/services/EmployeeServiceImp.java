package com.example.services;
import java.util.List;

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

    public boolean deleteemployee(int id) {

        boolean result=employeeDao.delete(employeeDao.findById(id));
        return result;
    }
}
