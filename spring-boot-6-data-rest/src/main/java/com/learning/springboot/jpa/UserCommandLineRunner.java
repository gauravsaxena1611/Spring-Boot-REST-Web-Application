package com.learning.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) {
		// save a couple of customers
		repository.save(new User("Gaurav", "Admin"));
		repository.save(new User("Ravi", "User"));
		repository.save(new User("Satish", "Admin"));
		repository.save(new User("Saxena", "User"));

		log.info("-------------------------------");
		log.info("Finding all users");
		log.info("-------------------------------");
		
		for (User user : repository.findAll()) 
			log.info(user.toString());
		
		//Checking new method created by us
		log.info("Admin users are.....");
		log.info("____________________");
		for (User user : repository.findByRole("Admin")) 
			log.info(user.toString());
		

	}

}