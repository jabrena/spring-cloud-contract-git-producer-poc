package com.example;

// remove::start[]

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.jab.microservices.BasicController;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.argThat;

// remove::end[]

@RunWith(MockitoJUnitRunner.class)
public abstract class BeerRestBase {
	//remove::start[]
	@InjectMocks
	BasicController producerController;

	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(producerController);
	}

	//remove::end[]
}
