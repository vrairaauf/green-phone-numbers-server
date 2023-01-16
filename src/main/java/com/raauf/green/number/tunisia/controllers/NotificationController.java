package com.raauf.green.number.tunisia.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raauf.green.number.tunisia.models.Notification;
import com.raauf.green.number.tunisia.services.NotificationService;


@RestController
@RequestMapping("green.phone.number.tunisia/api/v1/notification/")
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;
	
	@PostMapping("new/")
	public ResponseEntity<?> ucreate_notification(@RequestBody Notification notification) {
		notification.setDate(new Date());
		notificationService.save(notification);
		return ResponseEntity.ok("notification created successfully");
	}
	
	
	@GetMapping("all/")
	public ResponseEntity<?> all_notifications(){
		return notificationService.all();
	}
	

}
