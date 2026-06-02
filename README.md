# Library Management System

A Library Management System developed using Spring Boot. This application helps manage books in a library by providing CRUD (Create, Read, Update, Delete) operations through REST APIs.

## Features

- Add a new book
- View all books
- View a book by ID
- Update book details
- Delete a book
- RESTful API implementation
- Database integration using Spring Data JPA

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman (for API testing)

## Project Structure

```
src
 ├── main
 │   ├── java
 │   │   ├── controller
 │   │   ├── service
 │   │   ├── repository
 │   │   ├── entity
 │   │   └── LibraryManagementApplication
 │   └── resources
 │       └── application.properties
 └── test
```

## API Endpoints

### Add Book
```
POST /books
```

### Get All Books
```
GET /books
```

### Get Book By ID
```
GET /books/{id}
```

### Update Book
```
PUT /books/{id}
```

### Delete Book
```
DELETE /books/{id}
```

## Database Configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Running the Application

1. Clone the repository

```bash
git clone https://github.com/RavulaBalaram/library-management-system.git
```

2. Open the project in Eclipse or IntelliJ IDEA

3. Configure MySQL database

4. Run the application

5. Test APIs using Postman

## Future Enhancements

- User authentication and authorization
- Issue and return books
- Search books by title or author
- Pagination and sorting
- Frontend integration using React or Angular

## Author

Balaram Ravula
