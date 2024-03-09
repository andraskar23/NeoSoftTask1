package com.example.services;

import com.example.entity.Employees;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    public List<Employees> findAllEmployess();

    public Optional<Employees> getById(int id);

    public Employees addEmpolyeeDetails(Employees emp);
}
