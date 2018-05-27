We have implemented
------------------------------------

How our application now support bith JSON and XML in REQUEST  and RESPONSE. 

STEPS
-----
Implement dependency
		<dependency>
			<groupId>com.fasterxml.jackson.dataformat</groupId>
			<artifactId>jackson-dataformat-xml</artifactId>
		</dependency>
		
TESTING
-------
URL: http://localhost:8080/users/1

Change the ACCEPT and CONTENT-TYPE to : application/xml in HEADER at POSTMAN CLIENT.



Previous Project
----------------
spring-boot-rest-webservices-5-hateoas


URLS
----
Same as spring-boot-rest-webservices-1-helloworld project.
Please refer the Readme doc.

