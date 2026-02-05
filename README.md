# Item API – Spring Boot

This is a simple Java Spring Boot backend application created as a sample task.
The application provides REST APIs to add an item and fetch an item by ID.
Data is stored in memory using an ArrayList.

## Technologies Used
- Java
- Spring Boot
- Maven

## How to Run the Application
1. Open the project in IntelliJ or Eclipse
2. Run ItemapiApplication.java
   OR
3. Use command: mvn spring-boot:run

## API Endpoints

### Add Item
POST /items

Request Body:
{
"name": "Laptop",
"description": "Dell i5 Laptop"
}

### Get Item by ID
GET /items/{id}

Example:
GET /items/1

## Notes
This project uses in-memory storage, so data will be lost when the application restarts.

Note -> This application uses in-memory storage, so data will reset when the application restarts.
