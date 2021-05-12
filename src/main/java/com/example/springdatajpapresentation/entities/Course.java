package com.example.springdatajpapresentation.entities;

import java.util.List;

public class Course {
    private Long id;
    private String title;
    private List<Student> participants;

    public Course(String title, List<Student> participants) {
        this.title = title;
        this.participants = participants;
    }

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
