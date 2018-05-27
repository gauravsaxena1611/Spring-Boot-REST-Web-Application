In this project we have implemented
------------------------------------

1,Validations over beans, In this example we have implemented validations on User.

a) In the createUser method of UserController class we have used @Valid annotation 
b) Then on user bean class we haev used below things 
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name;

	@Past
	private Date birthDate;
c) In CustomizedResponseEntityExceptionHandler we have overridden new method handleMethodArgumentNotValid


We have created (ExceptionResponse) for this purpose.

CustomizedResponseEntityExceptionHandler is used to provide customised exceptions functionality I.E. ExceptionResponse for all our request.
@ControllerAdvice will make this CustomizedResponseEntityExceptionHandler available to all controller classes 



TESTING
-------
now when you use createUser method with only one character as name then validation error will occur
http://localhost:8080/users   -->  needs @RequestBody User user
This is POST request from UserController
POST REQUEST Format --> {"name":"A","birthDate":"2018-05-22T03:21:46.017+0000"}  

RESULT --> 400 BAD REQUEST with a CUSTOMER exception object.





Previous Project
----------------
spring-boot-rest-webservices-3-standard-exception


URLS
----
Same as spring-boot-rest-webservices-1-helloworld project.
Please refer the Readme doc.

