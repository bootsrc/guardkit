package com.frank.app.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
//@EnableAutoConfiguration
public class FooController {
	@RequestMapping("/")
	public String test() {
		return "{\"msg\":\"foo\"}";
	}
}
