package com.mayura.postmanAPI.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {    
	    @GetMapping("/employees/{id}")
	    public Map<String, Object> getEmployee(@PathVariable int id) {
	        return Map.of(
	            "id", id,
	            "name", "John"
	        );

	}
}