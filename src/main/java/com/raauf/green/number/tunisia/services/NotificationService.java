package com.raauf.green.number.tunisia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.raauf.green.number.tunisia.models.Notification;
import com.raauf.green.number.tunisia.repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	
	public void save(Notification notification){
		notificationRepository.save(notification);
	}
	
	public ResponseEntity<?> all(){
		return ResponseEntity.ok(notificationRepository.findAll());
	}
}
