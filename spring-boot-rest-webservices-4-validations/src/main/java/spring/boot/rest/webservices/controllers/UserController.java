package spring.boot.rest.webservices.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import spring.boot.rest.webservices.beans.User;
import spring.boot.rest.webservices.exceptions.UserNotFoundException;
import spring.boot.rest.webservices.services.UserDaoService;

@RestController
public class UserController {

	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user = service.findOne(id);

		if (user == null)
			throw new UserNotFoundException("id-" + id);

		return user;
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		User user = service.deleteById(id);

		if (user == null)
			throw new UserNotFoundException("id-" + id);
	}

	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);

		/**
		 * ServletUriComponentsBuilder.fromCurrentRequest()--> This returns
		 * current request URI I.E. /user .path("/{id}") --> Appends the above
		 * URI with --> .path("/{id}") .buildAndExpand(savedUser.getId()) -->
		 * Replaces the {id} with --> savedUser.getId() I.E. real value .toUri()
		 * --> Converts to full URI
		 */

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();

		/**
		 * ResponseEntity.created(**) --> Sends the correct response code of 201
		 * to the caller.
		 * 
		 * location --> Has to be given since client is not aware about details
		 * of newly created object. According to the REST standards, SERVER has
		 * to give all related URLs to the calling client about newly created
		 * resource.
		 * 
		 * Here newly created resource is new user
		 */

		return ResponseEntity.created(location).build();

	}
}