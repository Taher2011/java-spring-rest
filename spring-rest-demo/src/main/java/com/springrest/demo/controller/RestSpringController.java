package com.springrest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestSpringController {

	@GetMapping("/hello")
	public String hello() {
		return "Rest Spring";
	}
}
