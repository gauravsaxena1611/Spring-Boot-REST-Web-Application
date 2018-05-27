URLS
----
1, http://localhost:8080/hello-world  --> In this message is been printing form normal controller

2, http://localhost:8080/hello-world-bean  --> In this JSON response is printing. HOW?

When the request is been send to the controller then CONTROLLER sends the (HelloWorldBean) as response.
Now Spring auto-configuration checks this out and create a JSON object for it CALLING ALL GETTERS on the fields of (HelloWorldBean)
this is how we are receiving below JSON response.
{"message":"Hello World Form Bean"}

3,  http://localhost:8080/hello-world/path-variable/{name}
    http://localhost:8080/hello-world/path-variable/gaurav  --> {"message":"Hello World, gaurav"} 
    http://localhost:8080/hello-world/path-variable/super-man --> {"message":"Hello World, super-man"}
    
This is example of PATH-VARIABLE

4, http://localhost:8080/users --> GET request from UserController
Response -->
[{"id":1,"name":"Adam","birthDate":"2018-05-22T03:19:44.935+0000"},{"id":2,"name":"Eve","birthDate":"2018-05-22T03:19:44.935+0000"},{"id":3,"name":"Jack","birthDate":"2018-05-22T03:19:44.935+0000"}]

5, http://localhost:8080/users/{id}
   http://localhost:8080/users/1 --> GET request from UserController
Response --> {"id":1,"name":"Adam","birthDate":"2018-05-22T03:21:46.017+0000"}

6, http://localhost:8080/users/{id}  --> needs @PathVariable int id
   http://localhost:8080/users/1 --> DELETE request from UserController
   
7, http://localhost:8080/users   -->  needs @RequestBody User user
This is POST request from UserController
POST REQUEST Format --> {"name":"Adam","birthDate":"2018-05-22T03:21:46.017+0000"}

According to the REST standards, SERVER has to give all related URLs to the calling client about newly created resource.
Here newly created resource is new user

For detailed comment refer the comments in createUser method in UserController.

   

 