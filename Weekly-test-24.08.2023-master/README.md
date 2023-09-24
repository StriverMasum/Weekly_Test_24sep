# Jobs Management System Using Spring_Boot </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

## Overview
This project, named "Job Search Portal" is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information.
<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [License](#license)
5. [Acknowledgments](#acknowledgments)

<!-- Technologies Used -->
## Technologies Used
- Java 20
- Spring Boot
- Spring Web Initializer
- Spring Web Dependency
- Lombok
- Validation
- Swagger 
- H2 Database

## Key Features
- Add List of Jobs
- Update Jobs
- Get Jobs
- Get Jobs by Location And Salary
- Delete Jobs By Id
- Update Jobs By Id

## Usage
- Access the application at `http://localhost:8080/swagger-ui/index.html#/`.
- Use the provided API endpoints to manage your User Management.

### Controller:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.
