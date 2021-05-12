package com.example.springdatajpapresentation.gateways;

import com.example.springdatajpapresentation.entities.Course;
import com.example.springdatajpapresentation.entities.CourseMembership;
import com.example.springdatajpapresentation.entities.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseMembershipRepository extends CrudRepository<CourseMembership, Long> {
    List<Student> findStudentsByCourse(Course course);
}