package com.example.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jenkins.model.Student;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return Arrays.asList(
                new Student(1, "Rahul", 20, "Java"),
                new Student(2, "Anita", 21, "Spring Boot"),
                new Student(3, "Vikram", 22, "Microservices"),
                new Student(4, "Neha", 19, "React"),
                new Student(5, "Aman", 23, "DevOps")
        );
    }
}
