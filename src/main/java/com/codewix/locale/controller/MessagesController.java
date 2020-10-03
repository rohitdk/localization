package com.codewix.locale.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {
	@RequestMapping("/test")
	public String getMessage() {
		 	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 	LocalDateTime now = LocalDateTime.now();
		return "test message in English with current time: " + dtf.format(now);
	}
}
