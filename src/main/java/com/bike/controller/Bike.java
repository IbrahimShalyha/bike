package com.bike.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bike {
	@GetMapping(value = "/getThis")
	public String getThis() {
		return "I HATE THIS DUNYA";
	}
}
