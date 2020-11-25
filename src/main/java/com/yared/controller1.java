package com.yared;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller1 {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "HelloWorld";
	}

}
