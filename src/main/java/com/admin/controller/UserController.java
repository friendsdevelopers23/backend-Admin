package com.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.admin.model.UserModel;
import com.admin.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {

	@Autowired
	public final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(path = "/testVal")
	public void getUsers() {
		System.out.println("Reached ----------------");

	}

	@GetMapping
	public List<UserModel> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public Optional<UserModel> getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@PostMapping
	public UserModel createUser(@RequestBody UserModel user) {
		return userService.createUser(user);
	}

	@PutMapping("/{id}")
	public UserModel updateUser(@PathVariable Long id, @RequestBody UserModel updatedUser) {
		return userService.updateUser(id, updatedUser);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
}
