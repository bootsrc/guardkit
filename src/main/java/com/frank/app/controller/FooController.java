package com.frank.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
//@EnableAutoConfiguration
public class FooController {
	private static final Logger logger = LoggerFactory.getLogger(FooController.class);
	@RequestMapping("/")
	public String test() {
		String result = "{\"msg\":\"foo\"}";
		logger.info("logback demo result:{}", result);
		return result;
	}
}
