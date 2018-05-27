---------------------------------------------------
(1) Implementing Spring SECURITY using Spring BOOT
---------------------------------------------------
https://github.com/gauravsaxena1611/SpringBootForBeginners/blob/master/Step26.md

Authentication --> Are you the right USER.
Authorization  --> Do you have correct access to use this URL.


In this application we have implemented basic level of authentication

Below are the dependencies for the same

		 <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        
        
As soon as we add above dependency into the POM, 
every service will be shelled under BASIC SPRING AUTHENTICATION (Ask for user name and password).

Default Username is : user
for password : Check for (Using default security password:) in log




--------------------------
(2) How to CONFIGURE ROLE
--------------------------
https://github.com/gauravsaxena1611/SpringBootForBeginners/blob/master/Step27.md
Authentication

what we will do here
1, configure role
2, modify integration test
3, update unit test


We have created (SecurityConfig) to implement Spring SECURITY



---------------------------------------------
How to verify web-service with authentication
---------------------------------------------

When you enter below URL 
http://localhost:8080/surveys/Survey1/questions
enter following as user/pass
("user1")/("secret1")

Explore (SecurityConfig) java for all other security and role try and test



--------------------
modify INTIGRATION / UNIT test with spring security
---------------------
We have modified (SurveyControllerIT) to implement spring security in Integration Test.


We have SKIPPED security in (SurveyControllerTest) to skip the Spring Security we used below line of code
@WebMvcTest(value = SurveyController.class, secure = false)

We have skipped SECURITY because in UNIT Testing we only want to test the functionality, 
and in INTEGRATION test we have to test SECURITY.
 








