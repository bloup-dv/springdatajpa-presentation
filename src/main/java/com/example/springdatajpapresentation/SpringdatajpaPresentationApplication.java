package com.example.springdatajpapresentation;

import com.example.springdatajpapresentation.entities.Student;
import com.example.springdatajpapresentation.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdatajpaPresentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaPresentationApplication.class, args);
	}
	/*
	@Bean
	public CommandLineRunner demo(StudentRepository studentRepository){
		return (args) -> {
			studentRepository.save(new Student("Max","Mustermann"));
			studentRepository.save(new Student("Tim","Mustermann"));
			studentRepository.save(new Student("Ulf","Mustermann"));
			studentRepository.save(new Student("Kai","Mustermann"));

			for(Student student : studentRepository.findAll()){
				System.out.println(student.toString());
			}
			while(true) {}
		};

	}*/
}
