
package com.example.Dao;

import com.example.Pojo.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface IEmployeeDao extends JpaRepository<Employees,Integer>{
    boolean delete(Optional<Employees> byId);
}
