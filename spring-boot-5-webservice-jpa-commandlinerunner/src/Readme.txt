----------------------------
(1) Spring BOOT JPA
----------------------------
https://github.com/gauravsaxena1611/SpringBootForBeginners/blob/master/Step18.md
For good reference refer to --> Spring Data JPA - Reference Document

JPA helps to store data from OBJECT directly to DATABASE.

To check the code look at logs

Below are the dependencies for the same

		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
        </dependency>

As a part of SPRING BOOT - AUTO CONFIGURATION, there is one embaded DB(Which runs in the main memory) and we can use that. 
In this example we have used H2.

Embaded DBs are used in TESTING the application

ENTITY is a object which represents a table in CODE.

REPOSITORIES is a object whcih is used to SAVE data and GET data from DB

COMMAND-LINE-RUNNER are invoked at the application startup so that embaded DB can be populated with values in tables.
 
 
CONNECT to some other DB(REAL) other than embaded DB
-----------------------------------------------------
Useful Properties
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.initialize=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


-----------------------
(2) H2 CONSOLE
-----------------------
https://github.com/gauravsaxena1611/SpringBootForBeginners/blob/master/Step19.md
To launch the H2 console -->  http://localhost:8080/h2-console
make sure to Use db url jdbc:h2:mem:testdb

In order to launch this console we need to add DEV-OPS dependencies or else so some minor configurations. 











