package com.learning.springboot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	@Value("${welcome.message}")
	private String welcomeMessage;

         public String retrieveWelcomeMessage() {
                 //Here we will have complex business logic
                 return welcomeMessage;
         }
}
