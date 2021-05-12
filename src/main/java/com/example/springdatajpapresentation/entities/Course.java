package com.example.springdatajpapresentation.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @OneToMany
    private List<Student> participants;

    public Course(String title, List<Student> participants) {
        this.title = title;
        this.participants = participants;
    }

    public Course() {}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getParticipants() {
        return participants;
    }

    @Override
    public String toString(){
        return "Course "+ this.title + " id: "+this.id + " participants: "+ participants;
    }
}
