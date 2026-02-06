# Scale Store - Spring Boot Demo Project

A Spring Boot application that demonstrates order management and product handling using RESTful APIs with an in-memory H2 database.

## 🚀 Features

- **REST API Endpoints** for managing orders and products
- **Spring Data JPA** for database operations
- **H2 In-Memory Database** with console access for easy development and testing
- **Global Exception Handling** with custom error responses
- **Spring Boot Actuator** for application monitoring and metrics
- **Lombok** for reducing boilerplate code

## 🛠 Technology Stack

- **Java 21**
- **Spring Boot 3.5.10**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**
- **Maven**

## 📋 Prerequisites

- Java 21 or higher
- Maven 3.6+
- Git

## 🔧 Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd scale-store
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```
   
   Or run the JAR file:
   ```bash
   java -jar target/scale-store-0.0.1-SNAPSHOT.jar
   ```

## 🌐 API Endpoints

### Order Management
- **POST** `/api/orders/buy/{id}` - Purchase a product by ID

### Database Console
- **H2 Console**: [http://localhost:8082/h2-console](http://localhost:8082/h2-console)
  - URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: (leave blank)

## ⚙️ Configuration

The application default configuration can be found in `src/main/resources/application.properties`:

```properties
spring.application.name=scale-store
server.port=8082
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.hibernate.ddl-auto=update
```

### Key Settings:
- **Server Port**: 8082
- **Database**: H2 in-memory
- **Database Console**: Enabled at `/h2-console`
- **Hibernate DDL**: Auto-update tables

## 📁 Project Structure

```
scale-store/
├── src/main/java/com/poshmark/demo/
│   ├── controller/           # REST API controllers
│   ├── exception/            # Custom exceptions and global exception handler
│   ├── model/                # Entity classes
│   ├── repository/           # Data access layer (Spring Data JPA)
│   └── scale_store/          # Application entry point and business logic
│       └── service/          # Business logic services
├── src/main/resources/
│   ├── application.properties # Application configuration
│   ├── data.sql              # Initial database data
│   └── static/               # Static resources
├── pom.xml                   # Maven configuration
└── README.md                 # This file
```

## 📊 Database Schema

The application uses H2 database with the following entities:
- **Product** - Represents products in the store
- **Order** - Represents customer orders

Initial test data is loaded from `src/main/resources/data.sql`.

## 🧪 Testing

Run tests using Maven:
```bash
mvn test
```

Test files are located in `src/test/java/`.

## 🐛 Troubleshooting

### Port Already in Use
If port 8082 is already in use, you can change it in `application.properties`:
```properties
server.port=8083
```

### H2 Console Not Accessible
Ensure the following settings are in `application.properties`:
```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

## 📝 License

This project is provided as a demo project for educational purposes.

## 👤 Author

Poshmark Demo Project

---

For more information about Spring Boot, visit [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
