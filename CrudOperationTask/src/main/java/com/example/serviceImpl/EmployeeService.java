package com.example.serviceImpl;
import java.util.List;
import java.util.Optional;

import com.example.Dao.IEmployeeDao;
import com.example.Pojo.Employees;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class EmployeeService {

    @Autowired
    IEmployeeDao employeeDao;

    public List<Employees> findAllEmployess(){
        return employeeDao.findAll();
    }

    public boolean deleteemployee(int id) {

        boolean result=employeeDao.delete(employeeDao.findById(id));
        return result;
    }
}
