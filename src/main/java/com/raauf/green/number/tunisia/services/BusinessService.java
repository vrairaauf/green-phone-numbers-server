package com.raauf.green.number.tunisia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.raauf.green.number.tunisia.models.Business;
import com.raauf.green.number.tunisia.repository.BusinessRepository;

@Service
public class BusinessService {
	@Autowired
	private BusinessRepository businessRepository;
	
	public ResponseEntity<?> save(Business business){
		return ResponseEntity.ok(businessRepository.save(business));
	}
	
	public ResponseEntity<?> retrieve_by_category(String category){
		return ResponseEntity.ok(businessRepository.findByCategory(category));
	}
	
	public ResponseEntity<?> all(){
		return ResponseEntity.ok(businessRepository.findAll());
	}

	public boolean findByPhone(String phone) {
		return businessRepository.findByPhone(phone).isEmpty();
	}
}
