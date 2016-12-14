package com.frank.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
	@RequestMapping("")
	public String test() {
		return "{\"msg\":\"second\"}";
	}
}
