package com.example.springdatajpapresentation.entities;

public class Student {

    private Long id;

    private String firstName;

    private String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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
