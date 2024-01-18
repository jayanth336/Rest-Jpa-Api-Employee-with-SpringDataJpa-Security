# Rest-Jpa-Api-Employee-with-SpringDataJpa-Security

# Java class details 👈
* This is a regular CRUD project made using REST API.
* This project contains the below classes
   1. Entity class - Employee.java
   2. DAO interface that extends JpaRepository (given by Spring Data JPA) to carry out Database operations.
   3. Service interface and ServiceImpl class
   4. Controller class
   5. Classes to handle exceptions

# Security class details 👈
* This project has a class called SECURITY CONFIG
* Method 1 - A method returning UserDetailsManager
  > It uses JdbcUserDetailsManager to understand from which table user data needs to be retrieved and from which table roles need to be retrieved.
* Method 2 - A method returning SecurityFilterChain
  > It uses the HttpSecurity instance to set appropriate roles for appropriate Http actions

# Database details 👈
* We use the MySql database for this project.
* Database name is employee_directory and table name is employee.
* The name of the primary key field is id
