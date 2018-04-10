package com.test.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.dto.UserDto;
import com.test.test.model.User;
import com.test.test.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> createUser(@RequestBody UserDto userDto){
		userService.createUser(userDto);
	    return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(value="{/userId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteUser(@RequestParam Long userId){
		userService.deleteUser(userId);
	    return new ResponseEntity<Object>("Deleted",HttpStatus.OK);
	}
	@RequestMapping(value="{/userId}", method = RequestMethod.PUT)
	 public ResponseEntity<Object> updateUser(@PathVariable Long userId, @RequestBody UserDto userDto ){
		userService.updateUser(userId, userDto);
		return new ResponseEntity<Object>( HttpStatus.OK);
		
	}

}
