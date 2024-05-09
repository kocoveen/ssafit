package com.ssafy.fitnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.fitnect.model.dto.Gym;
import com.ssafy.fitnect.model.service.GymService;

import lombok.Data;

@RestController
@RequestMapping("/api")
public class GymController {
	
	private final GymService gymService;

	@Autowired
	public GymController(GymService gymService) {
		this.gymService = gymService;
	}
	
	
	@GetMapping("/gym")
	public ResponseEntity<?> gymAllList() {
		List<Gym> result = gymService.getAllGym();
		return ResponseEntity.ok().body(result);
	}
	
	@Data
	private class Result<T> {
		private T result;

		public Result(T result) {
			this.result = result;
		}
		
	}
}