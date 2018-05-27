How to monitor several services exposed by any REST application.

In case of micro services there are many small services and monitoring them is a big challange.

ACTUATOR is used in this regards

ACTUATOR also provides many services to be used in browser for this reason we will also use HAL BROWSER

HAL BROWSER makes it EASY to consume the HAL services which are been exposed by SPRING BOOT STATER ACTUATOR
 
 
ACTUATOR URLs are changing a lot from previous releases --> try with /actuator or /application


How to MONITOR REST SERVICES using - ACTUATOR
---------------------------------------------

STEPS
-----
a) Implement dependency
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.data</groupId>
			<artifactId>spring-data-rest-hal-browser</artifactId>
		</dependency>
		
b) (OPTIONAL) If we need some detailed info then we can use this in property file.
management.endpoints.web.exposure.include=*


		
TESTING
-------
a) URL: http://localhost:8080/actuator
   This will load services in HAL BROWSER








Previous Project
----------------
spring-boot-rest-webservices-7-swagger


URLS
----
Same as spring-boot-rest-webservices-1-helloworld project.
Please refer the Readme doc.

