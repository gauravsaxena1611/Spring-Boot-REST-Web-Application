package com.learning.springboot;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

         public String retrieveWelcomeMessage() {
                 //Here we will have complex business logic
                 return "Hello World, We have just created our first web service !!!";
         }
}
