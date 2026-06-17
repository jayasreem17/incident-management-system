# Incident Management System

## Overview

The Incident Management System is a Spring Boot-based REST API application used to manage and track incidents within an organization. It helps users create, update, monitor, and resolve incidents such as server failures, application errors, network issues, and other operational problems.

## Features

* User Authentication using JWT
* Create Incident
* View All Incidents
* Update Incident Details
* Delete Incident
* Track Incident Status
* Manage Incident Severity Levels
* Dashboard Statistics
* Global Exception Handling
* MySQL Database Integration

## Technologies Used

* Java 17
* Spring Boot
* Spring Security
* JWT Authentication
* Spring Data JPA (Hibernate)
* MySQL
* Maven
* Git & GitHub

## Project Structure

Controller → Service → Repository → Database

## API Endpoints

### Authentication

* POST /auth/login

### Incident Management

* POST /incident/create
* GET /incident/all
* GET /incident/{id}
* PUT /incident/update/{id}
* DELETE /incident/delete/{id}

## Incident Status

* OPEN
* IN_PROGRESS
* RESOLVED
* CLOSED

## Severity Levels

* LOW
* MEDIUM
* HIGH
* CRITICAL

## Database Configuration

Update `application.properties` with your MySQL configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/incident_db

spring.datasource.username=root

spring.datasource.password=your_password

## Running the Project

1. Clone the repository.
2. Create the MySQL database.
3. Configure application.properties.
4. Run:

mvn spring-boot:run

5. Test APIs using Postman.

## Future Enhancements

* React Frontend
* Email Notifications
* Role-Based Access Control
* Incident Assignment to Teams
* Reporting and Analytics Dashboard

## Author

Jayasree M
