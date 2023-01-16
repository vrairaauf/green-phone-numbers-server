package com.raauf.green.number.tunisia.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raauf.green.number.tunisia.models.Business;
import com.raauf.green.number.tunisia.services.BusinessService;

@RestController
@RequestMapping("green.phone.number.tunisia/api/v1/customer/business/")
public class BusinessController {
	
	@Autowired
	private BusinessService businessService;
	
	@PostMapping("new/")
	public ResponseEntity<?> make_business(@RequestBody Business business){
		if(!businessService.findByPhone(business.getPhone()))
			return ResponseEntity.ok("this phone already exists");
		business.setCreated_at(new Date());
		return businessService.save(business);
	}
	
	@GetMapping("all/")
	public ResponseEntity<?> find_all_numbers(){
		return businessService.all();
	}
	
	@GetMapping("retrieve/{category}/")
	public ResponseEntity<?> retrieve(@PathVariable String category){
		return businessService.retrieve_by_category(category);
	}
	
	
}
