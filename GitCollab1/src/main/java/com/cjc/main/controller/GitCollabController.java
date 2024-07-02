package com.cjc.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class GitCollabController {
	@PostMapping("/create")
	public ResponseEntity<Student>savestudent()
	{
		return null;
	}

}
