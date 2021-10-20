package com.nttdata.api.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.library.config.AdultProperties;

@RestController
@RequestMapping("/api/")
public class Controller {
	
	@Autowired
	AdultProperties adultProperties;
	
	@GetMapping("/age")
	@ResponseBody
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
