package com.test.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.dto.UserDto;
import com.test.test.model.User;
import com.test.test.repository.UserRepository;
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void createUser(UserDto userDto) {
		User user = new User();
		user.setUsername(userDto.getUsername());
		user.setFullname(userDto.getFullname());
		user.setEmail(userDto.getEmail());
		userRepository.save(user);
	}

	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}
}
