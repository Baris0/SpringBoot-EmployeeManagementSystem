package com.baris0.EmployeeManagementSystem.entities.concretes;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "surname")
    private String surname;

    @Email(message = "{com.baris0.EmployeeManagementSystem.email.message}")
    @Column(name = "email")
    private String email;

    @Column(name = "departmens")
    private String department;

    @Column(name = "working")
    private String working;

    @Column(name = "salary")
    private double salary;

}
