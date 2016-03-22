package com.nl.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;

public class DemoControllerTest extends BaseTestCase {

	@Before
	public void setUp() throws Exception {
		super.setup();
	}


    @Test
    public void helloWorldTest() throws Exception {
        this.mockMvc.perform(get("/working"))
                .andExpect(status().isOk())
                .andExpect(view().name("demoWork"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/demoWork.jsp"));
    }

}
