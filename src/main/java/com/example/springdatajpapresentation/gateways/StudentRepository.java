package com.example.springdatajpapresentation.gateways;

import com.example.springdatajpapresentation.entities.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByLastName(String lastName);
    Student findById(long id);
}