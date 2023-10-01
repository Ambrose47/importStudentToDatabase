package com.example.demo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    private String studentId;
    private String studentName;
    private String studentEmail;

    // Getters, setters, constructors, etc.
}