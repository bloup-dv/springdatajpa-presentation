package com.example.springdatajpapresentation;

import com.example.springdatajpapresentation.entities.Course;
import com.example.springdatajpapresentation.entities.CourseMembership;
import com.example.springdatajpapresentation.entities.Student;
import com.example.springdatajpapresentation.gateways.CourseMembershipRepository;
import com.example.springdatajpapresentation.gateways.CourseRepository;
import com.example.springdatajpapresentation.gateways.StudentRepository;
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
	try it out!
	@Bean
	public CommandLineRunner demo(StudentRepository studentRepository, CourseRepository courseRepository, CourseMembershipRepository courseMembershipRepository){
		return (args) -> {
			//fill DB
			courseRepository.save(new Course("musterCourse"));
			studentRepository.save(new Student("Max","Mustermann"));
			studentRepository.save(new Student("Tim","Mustermann"));
			studentRepository.save(new Student("Ulf","Mustermann"));
			studentRepository.save(new Student("Kai","Mustermann"));
			studentRepository.save(new Student("Uwe", "Mueller"));

			//connect

			for(Student student : studentRepository.findByLastName("Mustermann")){
				courseMembershipRepository.save(new CourseMembership(courseRepository.findFirstByTitle("musterCourse"), student));
			}
			System.out.println(courseMembershipRepository.findStudentsByCourse(courseRepository.findFirstByTitle("musterCourse")));
		};
	}
*/
}
