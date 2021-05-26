package com.rdtech.in.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.rdtech.in.bean.restcontrollerbean1;



@RestController
public class restcontrollercamel {
	
	@GetMapping("/service")
    public List<restcontrollerbean1> finditems() {
    	
    	List<restcontrollerbean1> data = new ArrayList<>();
    	data.add(new restcontrollerbean1("Dhruv sahu","dhruv@example.com","Jabalpur"));
    	data.add(new restcontrollerbean1("Mohan","mohan@example.com","pune"));
    	data.add(new restcontrollerbean1("Sohan","sohan@example.com","mumbai"));
		
		return data ;
	}
}
