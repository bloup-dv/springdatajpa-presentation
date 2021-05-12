package com.example.springdatajpapresentation.entities;

import javax.persistence.*;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "STUDENT_ID")
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Nullable
    private String firstName;

    @NonNull
    private String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString(){
        return String.format("Student id: %d \t name: %s, %s",this.id, this.lastName, this.firstName);
    }
}
