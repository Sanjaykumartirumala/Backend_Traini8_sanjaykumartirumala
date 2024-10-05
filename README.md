# Traini8 Training Center Registry

## Project Overview
This project is an MVP for the Traini8 startup, which provides a registry for government-funded training centers. The application exposes two RESTful APIs for creating and retrieving training center information.

## Features
- **POST API**: Create and save a new training center with the following fields:
  - Center Name
  - Center Code
  - Address (Detailed Address, City, State, Pincode)
  - Student Capacity
  - Courses Offered (List)
  - Created On (automatically generated timestamp)
  - Contact Email (validated if present)
  - Contact Phone (validated)
  
- **GET API**: Retrieve a list of all stored training centers.

## Technologies Used
- Java 11
- Spring Boot 3.x
- Spring Data JPA
- H2 Database (for testing)
- Maven
- Validation annotations for input validation

## Prerequisites
- Java Development Kit (JDK) 11 or higher
- Maven 3.6 or higher

## Setup Instructions

### 1. Clone the Repository
```bash
git clone <repository-url>
cd traini8


2. Build the Project
Use Maven to build the project. This will download the necessary dependencies.
mvn clean install

3. Run the Application
You can run the application using the command:
mvn spring-boot:run
Alternatively, you can run the packaged JAR file:
mvn clean package
java -jar target/traini8-0.0.1-SNAPSHOT.jar

4. Accessing the H2 Database Console (Optional)
If you want to view the H2 database console, you can access it at:
http://localhost:8080/h2-console
Use the following credentials:

JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (leave blank)
5. API Endpoints
Create a New Training Center
Endpoint: POST /api/v1/training-centers
Request Body:
{
    "centerName": "Tech Center",
    "centerCode": "TC1234567890",
    "address": {
        "detailedAddress": "123 Main St",
        "city": "Hyderabad",
        "state": "Telangana",
        "pincode": "500001"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Java", "Spring Boot"],
    "contactEmail": "techcenter@example.com",
    "contactPhone": "+919876543210"
}
Response: Returns the created training center details in JSON format.
Retrieve All Training Centers
Endpoint: GET /api/v1/training-centers
Response: Returns a list of all training centers in JSON format. If no centers exist, returns an empty list.
6. Validation
The API validates input fields. If validation fails, an appropriate error message is returned in JSON format.
7. Exception Handling
A global exception handler captures validation errors and provides a structured error response.
Project Structure
traini8
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── controller
│   │   │               │   └── TrainingCenterController.java
│   │   │               ├── exception
│   │   │               │   └── GlobalExceptionHandler.java
│   │   │               ├── model
│   │   │               │   ├── Address.java
│   │   │               │   └── TrainingCenter.java
│   │   │               ├── repository
│   │   │               │   └── TrainingCenterRepository.java
│   │   │               └── service
│   │   │                   └── TrainingCenterService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │           └── h2-console
│   └── test
├── pom.xml
└── README.md
Contribution
Contributions are welcome! Please feel free to submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any questions or issues, please contact me  at sanjaykumar231tirumala@gmail.com.

### Usage Instructions:
1. Replace `<repository-url>` with the URL of your GitHub repository.
2. Update the **Contact** section with your name and email.
3. Customize any other sections as needed for your specific project details.

Feel free to copy and paste this snippet directly into your README file! Let me know if you need further modifications.
