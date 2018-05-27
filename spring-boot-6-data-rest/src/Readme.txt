-------------------------------
(1) Spring DATA REST USING BOOT
--------------------------------
https://github.com/gauravsaxena1611/SpringBootForBeginners/blob/master/Step20.md

Now if we want to expose REST web-services around the DATA which we have exposed in JPA,
Then we have to create controllers and services. 

The easier way for this is to use SPRING DATA REST.

In this example we have created (UserRestRepository) which exposes REST web services for all JPA operations

Below are the dependencies for the same

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>


SPRING DATA REST not only post GET services, it also exposes other services like POST etc


Usefull URLs
------------
Hit http://localhost:8080/users in POSTMAN
http://localhost:8080/users/1
http://localhost:8080/users/?size=4  (Will get only 4 records - pagination)
http://localhost:8080/users/?sort=name,desc  (Sorting example)
@Param("role")
http://localhost:8080/users/search/findByRole?role=Admin  (We are calling our created service here)
POST Request format
--------------------
{
      "name" : "Gaurav",
      "role" : "Admin"
    }

Good for quick prototype! Be cautious about using this in Big applications!


-----------------------
(2) HATEOAS LINKS
-----------------------
HELPFUL LINKS FOR THE NEXT STEPS.

RESEARCH MORE ON THIS AND HOW TO USE THEM.












