package com.learning.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationRunner {

         @SuppressWarnings("unused")
		public static void main(String[] args) {
                 ApplicationContext ctx = SpringApplication.run(ApplicationRunner.class, args);

         }

}
