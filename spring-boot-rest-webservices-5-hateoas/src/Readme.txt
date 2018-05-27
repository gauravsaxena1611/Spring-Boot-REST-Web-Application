When ever w go to any webpage then apart for the thing which you order you see a lot of other stuff.
Like VoteUp, VoteDown, Link to profile page, Link to som other post etc..

These are the link to other resources/ perform other operations etc.

this means when asked for a resource from a SERVER, 
then SERVER not only give the result in the form of RESPONSE but also gives links to other useful resources.

THIS CONCEPT IS CALLED HATEOAS. 

In this project we have implemented
------------------------------------

Taken one resource and implemented HATEOAS concepts in it. 

STEPS
-----
a) Implement dependency
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-hateoas</artifactId>
		</dependency>
		
b) Modified method retrieveUser in UserController class

c) Added produces = MediaType.APPLICATION_JSON_VALUE to @RequestMapping to support this new addition


TESTING
-------
URL: http://localhost:8080/users/1

(PREVIOUS RESPONSE)
{"id":1,"name":"Adam","birthDate":"2018-05-22T03:21:46.017+0000"}

(NEW RESOPNSE)
{"id":1,"name":"Adam","birthDate":"2018-05-22T05:33:30.110+0000","_links":{"all-users":{"href":"http://localhost:8080/users"}}}




Previous Project
----------------
spring-boot-rest-webservices-4-validations


URLS
----
Same as spring-boot-rest-webservices-1-helloworld project.
Please refer the Readme doc.

