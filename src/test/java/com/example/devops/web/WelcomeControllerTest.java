package com.example.devops.web;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvcBuilder;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration

public class WelcomeControllerTest {

	private MockMvc mockMvc;

	@Autowired;
	 private WebApplicationContext context;

	@before
	public void setup() throws Exception {
		mockMvc = MockMvcBuilder.webAppContextSetup(context).build();
	}

	@Test
	public void testWelcome() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOK());
	}

}
