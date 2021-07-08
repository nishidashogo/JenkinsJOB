package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HelloWorld;

@RestController
@Component
public class HelloWorldController {
	
	@Autowired
	private HelloWorld hello;
	
	@RequestMapping("/hello")
	public String helloworld() {
		hello.setHelloworld("Hello World!!!");
		return hello.getHelloworld();
	}
}
