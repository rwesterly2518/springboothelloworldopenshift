package kn.nyc.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${thisapp.name:'DefaultName'}")
	private String appName; 
	
	@GetMapping("/")
	public String hello() {
		return "Hello World! from: '"+appName+"' The time is "+new Date();
	}
}
