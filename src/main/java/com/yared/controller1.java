package com.yared;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller1 {
	
	private Logger logger = LoggerFactory.getLogger(controller1.class);

	@GetMapping("/hello-world")
	public String helloWorld() {
		logger.info("hello -world logger");
		return "HelloWorld";
	}

}
