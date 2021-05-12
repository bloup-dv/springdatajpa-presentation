# Spring Data JPA
This is the repository for my ePortfolio on Spring Data JPA!

## Installation
You can preset and generate a Project with all necessary Spring dependencies [here: https://start.spring.io/](https://start.spring.io/)

If you want to initialize your project differently, Spring offers [Documentation](https://spring.io/projects/spring-data-jpa#learn), and some very well-documented [guides](https://spring.io/guides/gs/accessing-data-jpa/) about Spring Data JPA.

## About this project
This project implements a Course-system, where Students can be part of Courses. 
The two entities are stored on an H2 database together with the CourseMembership entity, 
which connects both of them to resolve the n:m - Relation. Using Spring Data JPA, 
CRUD-Repositories can easily be created and give access to the database.