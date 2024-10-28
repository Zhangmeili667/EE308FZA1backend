# 832202215_Zhang_Minhui_Contacts_Back-End

## Overview

This backend application is designed to manage contact information using a RESTful API. It provides functionality to list, create, read, update, and delete (CRUD) contacts. The application is built using Spring Boot, MyBatis for ORM, and Lombok for reducing boilerplate code.

## Key Features

- **List Contacts**: Retrieve a list of all contacts.
- **Create Contact**: Add a new contact to the database.
- **Read Contact**: Retrieve a contact by its unique ID.
- **Update Contact**: Update the information of an existing contact.
- **Delete Contact**: Remove a contact from the database.
- **Search Contacts**: Search contacts by name and gender.

## Technology Stack

- **Programming Language**: Java
- **Web Framework**: Spring Boot
- **ORM**: MyBatis
- **Lombok**: For reducing boilerplate code
- **Database**: SQL (implementation not specified)

## Project Structure
src/

├── main/

│   ├── java/

│   │   └── com.itheima/

│   │       ├── controller/

│   │       │   └── ContactController.java

│   │       ├── mapper/

│   │       │   └── ContactMapper.java

│   │       ├── pojo/

│   │       │   └── Contact.java

│   │       ├── service/

│   │       │   ├── ContactService.java

│   │       │   └── ContactServiceImpl.java

│   │       └── Result.java

│   ├── resources/

│   │   └── mapper/

│   │       └── ContactMapper.xml

│   └── application.properties

└── pom.xml


## Getting Started

1. **Prerequisites**: Ensure you have Java, Maven, and a SQL database installed.
2. **Database Setup**: Create a `contacts` table in your SQL database with the necessary columns (`id`, `name`, `number`, `gender`, `create_time`, `update_time`).
3. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/contact-management-backend.git
   ```
4. **Build the project**:
    ```bash
    mvn clean install
    ```
5. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```
## API Document
-**List Contacts**
   GET /contacts

-**Create Contact**
  POST /contacts
  Request Body: Contact object

-**Read Contact**
  GET /contacts/{id}

-**Update Contact**
  POST /updateContact
  Request Body: Contact object with ID

-**Delete Contact**
  DELETE /contacts/{id}

-**Search Contact**
  GET /searchByName?name={name}&gender={gender}

## Notes
The ContactMapper.xml file contains the MyBatis mappings for database operations.

The ContactController handles HTTP requests and interacts with the ContactService.

The ContactService defines the business logic and interacts with the ContactMapper.

The Contact class is a POJO representing a contact with Lombok annotations for boilerplate code reduction.

The Result class is used to standardize API responses.
