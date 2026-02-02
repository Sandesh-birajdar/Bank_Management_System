# Bank_Management_System

🏦 Bank Management System (BMS) – Hibernate Project

A Bank Management System developed using Core Java and Hibernate ORM.
This project uses annotation-based Hibernate configuration to map Java classes with database tables.

🚀 Technologies Used

Java (JDK 17)

Hibernate ORM (Annotation Based)

MySQL Database

Eclipse / IntelliJ IDEA

BMS_Backend_Project
│
├── src
│ └── main
│ └── java
│ └── com
│ └── bms
│ ├── client
│ │ └── Test.java
│ │
│ ├── config
│ │ └── HibernateUtil.java
│ │
│ ├── model
│ │ └── Account.java
│ │
│ ├── service
│ │ └── RBI.java
│ │
│ └── serviceimple
│ └── SBI.java
│
├── JRE System Library [JavaSE-23]
├── Referenced Libraries
└── pom.xml


## Description

- `src/main/java/com/bms/client` – Contains the test or main classes to run the project.  
- `src/main/java/com/bms/config` – Configuration classes (e.g., Hibernate setup).  
- `src/main/java/com/bms/model` – Data models like `Account.java`.  
- `src/main/java/com/bms/service` – Service interfaces, e.g., `RBI.java`.  
- `src/main/java/com/bms/serviceimple` – Service implementations, e.g., `SBI.java`.  
- `pom.xml` – Maven project file managing dependencies and build.  

## How to Build & Run

1. Clone the repository:  
   ```bash
   git clone <repository-url>


Navigate to the project folder:

cd BMS_Backend_Project


Build the project using Maven:

mvn clean install


Run your main class (e.g., Test.java) from your IDE or terminal.

This structure keeps your project organized, maintainable, and ready for GitHub display.


If you want, I can also **enhance it with collapsible folders** using GitHub’s `[details]` tag so the structure looks like an **expandable tree**, which is super clean in `README.md`.  

Do you want me to do that version too?
🧱 Package Description
🔹 com.bms.client

Contains the main execution class

Used to test banking operations

🔹 com.bms.config

Contains Hibernate configuration

HibernateUtil.java creates and manages SessionFactory

🔹 com.bms.model

Contains entity classes

Uses Hibernate annotations for ORM mapping

🔹 com.bms.service

Contains service interfaces

Defines business rules for banking operations

🔹 com.bms.serviceimple

Contains service implementation classes

Implements business logic

🏷️ Hibernate Annotations Used

The project uses annotation-based mapping instead of XML.

Common annotations used:

@Entity – Marks a Java class as a Hibernate entity

@Id – Specifies the primary key of the entity

@GeneratedValue – Automatically generates primary key values

@Column – Maps class fields to database columns

@Table – Specifies table name in the database

🗄️ Database Setup
1️⃣ Create Database
CREATE DATABASE BMS_hibernate_project;

2️⃣ Hibernate Configuration

Database details are configured in HibernateUtil.java:

URL: jdbc:mysql://localhost:3306/BMS_hibernate_project

Username: root

Password: MySQL password

Dialect: MySQL

DDL Mode: update

📦 Adding Libraries to Classpath

Right-click project → Build Path

Select Configure Build Path

Go to Libraries

Add required Hibernate and MySQL JAR files

Apply and close

Libraries will appear under Referenced Libraries.

▶️ How to Run the Project

Import project into Eclipse / IntelliJ

Start MySQL server

Ensure database BMS_hibernate_project exists

Run Test.java

Hibernate automatically creates tables using annotations

✅ Features

Annotation-based Hibernate mapping

Account entity persistence

Clean layered architecture

Automatic table generation

Easy extensibility

📌 Future Enhancements

Transaction management

Logging implementation

Validation annotations

UI or REST integration

👨‍💻 Author

Sandesh Birajdar
Java | Hibernate | MySQL
