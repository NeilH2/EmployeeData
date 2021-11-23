package com.example.codeclan.employeeData.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "employeeNum")
    private String employeeNum;
    @Column(name = "email")
    private String email;

    public Employee(String name, int age, String employeeNum, String email) {
        this.name = name;
        this.age = age;
        this.employeeNum = employeeNum;
        this.email = email;
    }


    public Employee() { // NEW

    }

    public Long getId() { // NEW
        return id;
    }

    public void setId(Long id) { // NEW
        this.id = id;
    }

}
