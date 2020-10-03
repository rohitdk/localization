package com.codewix.locale.controller;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MessagesControllerTests {

	@Mock
	MessagesController messagesController;
	
	@BeforeEach
	  public void createMocks() {
	    MockitoAnnotations.initMocks(this);
	  }
	
	@Test
	public void testMessages() {
		messagesController.getMessage();
		
	}
}
