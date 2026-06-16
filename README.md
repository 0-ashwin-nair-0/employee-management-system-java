# Employee Management System (Java)

A simple Java-based Employee Management System developed to demonstrate core Object-Oriented Programming (OOP) concepts in Java. This project showcases the implementation of classes, objects, constructors, encapsulation, validation using setters, salary calculations, and employee bonus management.

## Features

* Create employee objects using both default and parameterized constructors.
* Store employee information such as:

  * Employee ID
  * Name
  * Age
  * Department
  * Salary
* Validate employee details using setter methods.
* Calculate annual salary based on monthly salary.
* Apply salary raises using a bonus percentage.
* Display employee details in a structured format.

## Technologies Used

* Java
* IntelliJ IDEA (or any Java IDE)
* Git & GitHub

## Project Structure

```text
employee-management-system-java/
│
├── Employee.java
├── EmployeeMain.java
└── README.md
```

## Concepts Demonstrated

This project focuses on the following Java concepts:

* Classes and Objects
* Encapsulation
* Constructors and Constructor Overloading
* Getters and Setters
* Method Creation
* Exception Handling using `IllegalArgumentException`
* Basic Business Logic Implementation

## Example Output

```text
Employee Details
Employee Name: Ashwin Nair
Employee Age: 25
Employee Department: Software Engineer
Employee Monthly Salary: 50000.0
Employee Annual Salary: 600000.0

Madara you received a raise of 40.0 %
Monthly Salary after the raise: 70000.0
Annual Salary after the raise: 840000.0
```

## Future Improvements

Potential enhancements for this project include:

* Managing multiple employees using collections (`ArrayList`).
* Searching employees by ID or name.
* Updating and deleting employee records.
* Persisting employee data using file handling.
* Integrating a database using JDBC and MySQL.
* Developing a graphical user interface (GUI).

## Getting Started

### Prerequisites

* Java Development Kit (JDK 8 or above)
* Git (optional, for version control)

### Running the Project

1. Clone the repository:

```bash
git clone https://github.com/<your-username>/employee-management-system-java.git
```

2. Navigate to the project directory:

```bash
cd employee-management-system-java
```

3. Compile the Java files:

```bash
javac Employee.java EmployeeMain.java
```

4. Run the application:

```bash
java EmployeeMain
```

## Author

Developed as part of Java learning and practice to strengthen understanding of Object-Oriented Programming principles.
