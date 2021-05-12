package com.example.springdatajpapresentation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @NonNull
    @Column(name = "COURSE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    public Course(String title){
        this.title = title;
    }

    public Course() {}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return "Course "+ this.title + " id: "+this.id;
    }
}
