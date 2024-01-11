package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.service.service;

@RestController
public class controller {
	
	@Autowired
	private service service;
	

	  @QueryMapping( "employees")
	  public List<model> getAll() {
	        return this.service.getAll();
	    }

	  @QueryMapping("employee")
	  public model get(@Argument int Id) {
	        return service.get(Id);
	    }
	  
	  @MutationMapping("create")
	  public model create(@Argument("input") model model)
	  {
		  return service.create(model);
	  }
	  
	  @PostMapping("/add")
	  public model add (@RequestBody model model)
	  {
		  return this.service.add(model);
	  }
	  
}
