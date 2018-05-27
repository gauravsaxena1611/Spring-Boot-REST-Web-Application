SOAP services have WSDL where entire service is documented.

SWAGGER is the most common DOCUMENTATION in REST

How to DOCUMENT REST SERVICES using - SWAGGER
---------------------------------------------

STEPS
-----
a) Implement dependency
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.4.0</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.4.0</version>
		</dependency>
		
b) Created new class SwaggerConfig

c) (OPTIONAL) If we need some discriptions or restrictions to show on BEAN then we can use this.
We have used User Bean in this regards. Used following annnotations.

@ApiModel(value="User Details", description="Contains all details of a user")
@ApiModelProperty(notes = "Name should have atleast 2 characters")
@ApiModelProperty(notes = "Birth Date should be in the Past")


		
TESTING
-------
a) URL: http://localhost:8080/v2/api-docs
   Documentation interms of JSON Response

b) URL: http://localhost:8080/swagger-ui.html
   This will present all APIs in a HTML page






Previous Project
----------------
spring-boot-rest-webservices-5-hateoas


URLS
----
Same as spring-boot-rest-webservices-1-helloworld project.
Please refer the Readme doc.

