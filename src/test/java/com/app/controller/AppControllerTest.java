package com.app.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.app.service.impl.AppServiceImpl;

@ExtendWith(MockitoExtension.class)
class AppControllerTest {

	@InjectMocks
	AppController appController;

	@Mock
	AppServiceImpl serviceImpl;

	@Test
	void getApiTest() {
		ResponseEntity<String> obj = new ResponseEntity<String>("This is response from get API", HttpStatus.OK);
		when(serviceImpl.getApp()).thenReturn(obj);
		ResponseEntity<String> response = appController.getApi();
		assertEquals(obj, response);
	}

}
