package com.example.demodeployoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HealthCheck {

	@GetMapping(path = "/healthCheck")
	public ResponseEntity<Object> salud(){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(path = "/healthCheck_v2")
	public ResponseEntity<Object> saludV2(){
		return new ResponseEntity<>("Disponible", HttpStatus.OK);
	}
}
