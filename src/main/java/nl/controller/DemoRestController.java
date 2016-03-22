package nl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import nl.entity.MainPojo;

@RestController

public class DemoRestController {

	@RequestMapping(value="/rest/working",method=RequestMethod.GET)
	public  MainPojo  getJSONData() {

		MainPojo pojo = new MainPojo();
		pojo.setValue("It works");
		
		return pojo;

	}
	
}
