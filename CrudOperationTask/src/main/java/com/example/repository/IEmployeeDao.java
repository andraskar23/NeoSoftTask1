
package com.example.repository;

import com.example.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IEmployeeDao extends JpaRepository<Employees,Integer>{
   // boolean delete(Optional<Employees> emp);
//    boolean delete(Optional<Employees> byId);
}
