package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.model;
import com.example.demo.Repository.Repository;



@org.springframework.stereotype.Service
public class Service {
	
		@Autowired
		Repository Erepo;
		public String addDetails(model ee) {
			Erepo.save(ee);
			return "Data added";
		}
		public String updateDetails(model ee) {
			Erepo.saveAndFlush(ee);
			return "Data updated";
		}
		
		public String deleteDetails(int id) {
			Erepo.deleteById(id);
			return "data Deleted";
		}
		public List<model> showDetails() {
				return Erepo.findAll();
		}

}