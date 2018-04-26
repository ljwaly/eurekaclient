package com.ljw.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

	@RequestMapping("/world")
	public String worldSrd(){
		return "world is round=8762";
	}
}
