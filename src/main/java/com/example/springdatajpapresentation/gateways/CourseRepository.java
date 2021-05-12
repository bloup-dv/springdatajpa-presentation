package com.example.springdatajpapresentation.gateways;

import com.example.springdatajpapresentation.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {
    Course findFirstByTitle(String title);
    Course findById(long id);
}