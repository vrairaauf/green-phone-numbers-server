package com.raauf.green.number.tunisia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.raauf.green.number.tunisia.models.Business;

public interface BusinessRepository extends MongoRepository<Business, String>{
	Optional<List<Business>> findByCategory(String category);
	Optional<List<Business>> findByPhone(String phone);
}
