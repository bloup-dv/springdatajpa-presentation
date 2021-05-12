package com.example.springdatajpapresentation.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    private Course testCourse;


    @BeforeEach
    void setUp() {
        Student student1 = new Student("Max", "Mustermann");
        Student student2 = new Student("Erika", "Mustermann");
        this.testCourse = new Course("testCourse", List.of(student1,student2));
    }

    @Test
    void testToString() {
        String result = "Course "+ this.testCourse.getTitle()+" id: "+ this.testCourse.getId() + " participants: " + testCourse.getParticipants();
        assertEquals(result, this.testCourse.toString());
    }
}