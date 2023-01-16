package com.raauf.green.number.tunisia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.raauf.green.number.tunisia.models.Notification;

public interface NotificationRepository extends MongoRepository<Notification, String> {
	
}
