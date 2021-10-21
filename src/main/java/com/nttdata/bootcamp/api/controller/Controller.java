package com.nttdata.bootcamp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.library.config.AdultProperties;

@RestController
public class Controller {
	
	@Autowired
	AdultProperties adultProperties;
	
	@GetMapping("/age")
	public int getAge() {
		System.out.println( "Llamada a adultProperties" + adultProperties.getAge() );
		return adultProperties.getAge();
	}
	
//	@GetMapping("/age/{age}")
//	@ResponseBody
//	public String getMessage( @PathVariable final int age ) {
//		return adultProperties.getAge();
//	}
	
}
