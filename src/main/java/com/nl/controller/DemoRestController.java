package com.nl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nl.entity.TestPojo;

@RestController

public class DemoRestController {

	@RequestMapping(value="/rest/working",method=RequestMethod.GET)
	public  TestPojo getJSONData() {

		TestPojo pojo = new TestPojo();
		pojo.setValue("It works");
		
		return pojo;

	}
	
}
