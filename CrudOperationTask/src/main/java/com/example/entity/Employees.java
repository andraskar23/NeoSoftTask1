package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "empId")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "doj")
    private String joiningDate;


}