package com.sebastianzabrzyski.domowabiblioteka.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.sebastianzabrzyski.domowabiblioteka.service.UserService;
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = UserController.class)
class UserControllerTest {
	
	 @Autowired
     private MockMvc mockMvc;
	 
     @MockBean
     UserService userService;

	@Test
	void testShowRegistrationForm() throws Exception {
			
        mockMvc.perform(get("/registration"))
        .andExpect(status().isOk())
        .andExpect(view().name("registration.html"))
        .andExpect(model().attributeExists("user"));
	}



}
