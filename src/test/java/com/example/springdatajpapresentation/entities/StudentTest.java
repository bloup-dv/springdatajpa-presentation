package com.example.springdatajpapresentation.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student testStudent;
    @BeforeEach
    void setUp() {
        this.testStudent = new Student("Max", "Mustermann");
    }

    @Test
    void testToString() {
        String result = "Student id: "+this.testStudent.getId()+" \t name: "+this.testStudent.getLastName()+", "+this.testStudent.getFirstName()+"";
        assertEquals(result, this.testStudent.toString());
    }
}