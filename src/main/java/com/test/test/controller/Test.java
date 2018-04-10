package com.test.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Object>getUsers(){
		
		return new ResponseEntity<Object>("Hello nandayo",HttpStatus.OK);
	}
}
