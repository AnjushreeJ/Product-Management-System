# Product Management System

## Project Overview

This project is a Product Management System developed using Spring Boot, Spring MVC, Thymeleaf, Hibernate, and MySQL. The application allows users and administrators to perform CRUD operations such as adding, updating, deleting, and viewing products.

The project follows layered MVC architecture and integrates Spring Security for secure authentication and authorization. It demonstrates full-stack web application development with database integration and product management functionalities.

---

# Technologies Used

| Technology         | Purpose                        |
| ------------------ | ------------------------------ |
| Java               | Programming Language           |
| Spring Boot        | Backend Framework              |
| Spring MVC         | MVC Architecture               |
| Spring Data JPA    | Database ORM                   |
| Hibernate          | Database Mapping               |
| Thymeleaf          | Frontend Template Engine       |
| MySQL              | Relational Database            |
| Spring Security    | Authentication & Authorization |
| Maven              | Dependency Management          |
| HTML/CSS/Bootstrap | Frontend Design                |

---

# Features

## Product Management

* Add New Products
* Update Existing Products
* Delete Products
* View Product List
* View Product Details

## Authentication & Security

* Secure Login System
* Spring Security Authentication
* Password Encryption
* Protected Endpoints

## Database Integration

* MySQL Database Connectivity
* Automatic Table Creation using Hibernate
* Data Persistence using JPA

---

# Project Architecture

```text
Frontend (Thymeleaf)
        ↓
Controller Layer
        ↓
Service Layer
        ↓
Repository Layer
        ↓
MySQL Database
```

---

# Project Structure

```text
src/main/java
│
├── controller
│   ├── ProductController.java
│   └── UserController.java
│
├── service
│   ├── ProductService.java
│   └── UserService.java
│
├── repository
│   ├── ProductRepository.java
│   └── UserRepository.java
│
├── entity
│   ├── Product.java
│   └── User.java
│
├── config
│   └── SecurityConfig.java
│
└── ProductManagementApplication.java
```

---

# Database Configuration

Create MySQL database:

```sql
CREATE DATABASE product_management;
```

---

# application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product_management
spring.datasource.username=root
spring.datasource.password=MYsql@123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

server.port=8080
```

---

# Important Dependencies

## Spring Web

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

---

## Spring Data JPA

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

---

## Thymeleaf

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

---

## MySQL Driver

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>
```

---

## Spring Security

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

---

# Explanation of Important Files

## 1. ProductManagementApplication.java

Main Spring Boot application class.

Purpose:

* Starts Spring Boot application
* Initializes embedded Tomcat server
* Loads Spring Context

---

## 2. Product.java

Entity class representing product table.

### Fields

| Field       | Description         |
| ----------- | ------------------- |
| id          | Product ID          |
| productName | Product Name        |
| description | Product Description |
| price       | Product Price       |
| quantity    | Product Quantity    |

Purpose:

* Stores product information in database

---

## 3. ProductRepository.java

Repository interface extending JpaRepository.

Purpose:

* Save Products
* Update Products
* Delete Products
* Fetch Product Details

---

## 4. ProductService.java

Service layer containing business logic.

Purpose:

* Validate product data
* Handle CRUD operations
* Communicate with repository layer

---

## 5. ProductController.java

Controller layer handling HTTP requests.

Purpose:

* Receive client requests
* Process product operations
* Return Thymeleaf pages

---

## 6. SecurityConfig.java

Spring Security configuration class.

Purpose:

* Configure authentication
* Configure authorization
* Encrypt passwords using BCrypt

---

# CRUD Operations Flow

## Add Product

```text
Frontend Form
      ↓
Controller
      ↓
Service
      ↓
Repository
      ↓
MySQL Database
```

---

## Update Product

```text
User selects product
      ↓
Controller fetches product
      ↓
Update form displayed
      ↓
Updated data saved
```

---

## Delete Product

```text
Delete Button
      ↓
Controller
      ↓
Repository deleteById()
      ↓
Database
```

---

# Validation Features

The project supports validation using Bean Validation.

Example:

```java
@NotBlank(message = "Product name cannot be empty")
private String productName;

@Positive(message = "Price must be positive")
private double price;
```

Validation Features:

* Empty field validation
* Positive price validation
* Quantity validation
* Duplicate prevention

---

# API Endpoints

| Method | Endpoint                | Description      |
| ------ | ----------------------- | ---------------- |
| GET    | /                       | Home Page        |
| GET    | /products               | View Products    |
| GET    | /showNewProductForm     | Add Product Form |
| POST   | /saveProduct            | Save Product     |
| GET    | /showFormForUpdate/{id} | Update Product   |
| GET    | /delete/{id}            | Delete Product   |

---

# Steps to Run the Project

## Step 1: Install Required Software

Required:

* Java 17
* Eclipse / STS
* MySQL
* Maven

---

## Step 2: Create Database

```sql
CREATE DATABASE product_management;
```

---

## Step 3: Configure application.properties

Update database username and password.

---

## Step 4: Import Project

In Eclipse:

```text
File
→ Import
→ Existing Maven Project
```

---

## Step 5: Update Maven

```text
Right Click Project
→ Maven
→ Update Project
```

---

## Step 6: Run Project

```text
Run As → Spring Boot App
```

---

## Step 7: Open Browser

```text
http://localhost:8080
```

---

# Security Features

* Spring Security Authentication
* Password Encryption using BCrypt
* Secure Login System
* Protected Endpoints

---

# Future Enhancements

* Product Search Functionality
* Product Image Upload
* Product Categories
* Dashboard Analytics
* JWT Authentication
* Cloud Deployment
* REST API Integration

---

# Advantages of Project

* Industry Standard MVC Architecture
* Secure Authentication
* Easy CRUD Operations
* Database Integration
* Scalable Design
* User Friendly Interface
* Suitable for internships and placements

---

# Common Errors and Solutions

## Error: Access denied for user

Solution:

```properties
spring.datasource.password=MYsql@123
```

---

## Error: Unknown database product_management

Solution:

```sql
CREATE DATABASE product_management;
```

---

## Error: Port 8080 already in use

Solution:

```properties
server.port=8081
```

---

## Error: Maven Dependencies Not Downloaded

Solution:

```text
Right Click Project
→ Maven
→ Update Project
```

---

# Output

The application successfully provides:

* Product Management
* Secure Authentication
* CRUD Operations
* Database Storage
* Spring Security Integration
* Full Stack Web Application Functionality

---

# Conclusion

This Product Management System demonstrates implementation of a secure full-stack web application using Spring Boot and MySQL.

The project follows industry-standard layered MVC architecture and supports product management functionalities with CRUD operations and secure authentication.

The application can be enhanced further by integrating advanced features such as product search, image upload, analytics dashboard, and cloud deployment.

---

# Author

Anjushree J

BE Computer Science Engineering

Spring Boot Developer

