package com.example.demo.entity;
import jakarta.persistence.Entity;
@Entity

public class StudentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private string name;
    private string email;
    private float cgpa;

      

}