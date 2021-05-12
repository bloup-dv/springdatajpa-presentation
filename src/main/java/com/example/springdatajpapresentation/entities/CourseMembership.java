package com.example.springdatajpapresentation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class CourseMembership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    public CourseMembership(){}
    public CourseMembership(Course course, Student student){
        this.course = course;
        this.student = student;
    }
}
