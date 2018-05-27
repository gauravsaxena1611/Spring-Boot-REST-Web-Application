In this project we have implemented
------------------------------------

1, UserNotFoundException in UserController class.

so now if a http://localhost:8080/users/{id} is called with any id which is not present like 500 (http://localhost:8080/users/500);
Then previously application was returning status 200 OK and no response object.
Now application throws 404 NOT FOUND error with UserNotFoundException object.

2, Standard Exception structure to be followed in entire application
   







URLS
----
Same as spring-boot-rest-webservices-1-helloworld project.
Please refer the Readme doc.

