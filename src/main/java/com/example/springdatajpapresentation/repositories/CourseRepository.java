package com.example.springdatajpapresentation.repositories;

import com.example.springdatajpapresentation.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}