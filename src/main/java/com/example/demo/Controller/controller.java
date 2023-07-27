package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.model;
import com.example.demo.Service.Service;
@RestController
@CrossOrigin
public class controller {
	@Autowired
	Service Eservice;
	
	@GetMapping("/showDetails")
	public List <model> show() {
		return Eservice.showDetails();
	}
	
	@PutMapping("/updateDetails")
	public String update(@RequestBody model ee) {
		return Eservice.updateDetails(ee);
	}
	
	@DeleteMapping("/deleteDetails/{eid}")
	public String delete(@PathVariable("eid") int id) {
		return Eservice.deleteDetails(id);
	}
	
	@PostMapping("/addDetails")
	public String add(@RequestBody model ee) {
		return Eservice.addDetails(ee);
		
	}
}