package com.app.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl {

	public ResponseEntity<String> getApp() {
		return new ResponseEntity<String>("This is response from get API", HttpStatus.OK);
	}

}
