package com.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path ="/testDee")
	public String getAppReq()
	{
		System.out.println("Hello");
		return "Hello";
	}
}
