package com.docker.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@GetMapping("/")
	public String hello() {
		return "<h1> Hello World </h1>";
	}

}
