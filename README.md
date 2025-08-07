# Spring Boot CRUD Operations

---

### Overview

This project is a **Spring Boot application** demonstrating basic **CRUD (Create, Read, Update, Delete)** operations using Spring MVC, Spring Data JPA, and a relational database. It serves as a practical implementation of RESTful services with proper API design and layered architecture.

---

### Features

- Create new records (POST)
- Retrieve all or specific records (GET)
- Update existing records (PUT)
- Delete records (DELETE)
- Simple, testable REST APIs
- Follows MVC pattern and layered architecture (Controller → Service → Repository)

---

### Tech Stack

- **Framework**: Spring Boot  
- **Language**: Java  
- **Database**: H2 / MySQL / PostgreSQL (as configured)  
- **Build Tool**: Maven or Gradle  
- **JPA**: Spring Data JPA  
- **Testing Tools**: Postman / Swagger UI  

---

### How to Run the Project

#### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Springboot-CURD-Operations.git
cd Springboot-CURD-Operations
```

#### 2. Open the Project in IDE

Import it into **IntelliJ IDEA**, **Eclipse**, or any Java IDE that supports Maven or Gradle projects.

#### 3. Configure the Database (Optional)

For **H2 (in-memory)**, no setup is needed.  
For **MySQL/PostgreSQL**, update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_name
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

#### 4. Build and Run the Application

```bash
# If using Maven
mvn spring-boot:run

# If using Gradle
./gradlew bootRun
```

---

### Sample API Endpoints

| Method | Endpoint               | Description           |
|--------|------------------------|-----------------------|
| POST   | `/api/students`        | Add a new student     |
| GET    | `/api/students`        | Get all students      |
| GET    | `/api/students/{id}`   | Get student by ID     |
| PUT    | `/api/students/{id}`   | Update student by ID  |
| DELETE | `/api/students/{id}`   | Delete student by ID  |

---

### Folder Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.example.crud/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       ├── model/
│   │       └── CrudApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql
```

---

### Acknowledgement

I would like to express my sincere gratitude to my mentor **Gokul** for his continuous guidance and support throughout the development of this project.

---


### Feedback & Contributions

If you have suggestions to improve this project or want to contribute:

- ⭐ Star this repository  
- 🐛 Report bugs via Issues  
- 🔧 Submit a Pull Request

---

