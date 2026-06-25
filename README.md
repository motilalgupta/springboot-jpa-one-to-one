# 🔗 JPA One-to-One Mapping Example

This project demonstrates a One-to-One relationship using Spring Boot, Spring Data JPA, and MySQL.

In this example:

* One Student owns one Laptop.
* One Laptop belongs to one Student.

## 🚀 Technologies Used

* Java 17+
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

## 📂 Project Structure

```text
src/main/java
│
├── entity
│   ├── Student.java
│   └── Laptop.java
│
├── repository
│   ├── StudentRepository.java
│   └── LaptopRepository.java
│
├── controller
│   └── StudentController.java
│
└── JpaApplication.java
```

## 🎓 Student Entity

```java
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;
}
```

## 💻 Laptop Entity

```java
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
}
```

## 🔄 Relationship

```text
Student  -----------  Laptop
   1                     1
```

Each student can have only one laptop, and each laptop belongs to only one student.

## 🗄️ Database Tables

### student

| Column    |
| --------- |
| id        |
| name      |
| laptop_id |

### laptop

| Column |
| ------ |
| id     |
| brand  |

## 📥 Sample JSON

```json
{
  "name": "Motilal Gupta",
  "laptop": {
    "brand": "Dell"
  }
}
```

## 📡 API Endpoint

### Create Student with Laptop

```http
POST /students
```

### Get All Students

```http
GET /students
```

### Get Student By ID

```http
GET /students/{id}
```

## ⚙️ Database Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cfs
spring.datasource.username=root
spring.datasource.password=your_password_here

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## ▶️ Run the Project

```bash
git clone https://github.com/your-username/jpa-one-to-one-mapping.git
cd jpa-one-to-one-mapping
mvn spring-boot:run
```

## 🎯 Learning Outcomes

* JPA Entity Relationships
* One-to-One Mapping
* Cascade Types
* JoinColumn Annotation
* Spring Data JPA
* MySQL Integration

## 👨‍💻 Author

Motilal Gupta
