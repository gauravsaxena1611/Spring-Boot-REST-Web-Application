REST Request Types - Different Request Methods
-----------------------------------------------
GET - Retrieve details of a resource
POST - Create a new resource
PUT - Update an existing resource
PATCH - Update part of a resource
DELETE - Delete a resource



---------------------------
Header with sending Request
---------------------------
while sending request to server, client can use TWO options in header
1, ACCEPT  --> What format of RESPONCE does CLIENT expect.
2, CONTENT --> What request format CLIENT is sending to SERVER.

-------------------------------------------------------------------------------------------------------
(1) Content Negotiation (Use below option in Web-Services section below for --> POST Request Example )
-------------------------------------------------------------------------------------------------------
This means that Client passes Accept: <Some format> and if server supports that format then server responds back with result in that format.

Usual format supported
-----------------------
application/json (Default)
application/xml (How to implement this? by following one steps)

Add dependency in POM.XML, Spring boot auto configuration will automatically detects is and will start supporting XML format for all URLs.
		<dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
        </dependency>





-----------------------
How to test Web-Services
-----------------------
We haev used POSTMAN client at CROME browser to check the POST request.





Web-Services
--------------------

---------------------
(GET Request Example )
----------------------
1, http://localhost:8080/welcome

2, http://localhost:8080/surveys/{surveyId}/questions
http://localhost:8080/surveys/Survey1/questions

3,  http://localhost:8080/surveys/{surveyId}/questions/{questionId}
http://localhost:8080/surveys/Survey1/questions/Question1

------------------------
(POST Request Example )
------------------------
4, http://localhost:8080/surveys/{surveyId}/questions
http://localhost:8080/surveys/Survey1/questions

Note that here we have used same URL as of 2, but in this request type is post hence we need to do below two task additionally
    A) make request type --> Application JSON
    B) create this as a request body --> {"description":"Second Most Populous Country in the World","correctAnswer":"India","options":["India","Russia","United States","China"]}





------------------------
(2) Spring Boot Actuator
------------------------
This is a plugin which comes with spring boot for moitoring purpose. This helps to look following things for entire application
/env, /metrics, /trace, /dump, /shutdown, /beans, / autoconfig, /configprops, /mappings

Just need to add following dependency
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>


HAL Browser --> Used for viewing the results from Actuator urls in a readeable format
http://localhost:8080/actuator/

Just need to add following dependency        
        <dependency>
            <groupId>org.springframework.data</groupId>
            <artifactId>spring-data-rest-hal-browser</artifactId>
        </dependency>



