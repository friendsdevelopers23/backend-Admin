package com.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.UserModel;
import com.admin.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	 private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<UserModel> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public Optional<UserModel> getUserById(Long id) {
	        return userRepository.findById(id);
	    }

	    public UserModel createUser(UserModel user) {
	        return userRepository.save(user);
	    }

	    public UserModel updateUser(Long id, UserModel updatedUser) {
	        Optional<UserModel> existingUser = userRepository.findById(id);
	        if (existingUser.isPresent()) {
	        	UserModel user = existingUser.get();
	            user.setName(updatedUser.getName());
	            user.setEmail(updatedUser.getEmail());
	            return userRepository.save(user);
	        }
	        return null;
	    }

	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
	}

