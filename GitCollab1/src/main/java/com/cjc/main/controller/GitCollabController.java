package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.GitCollabService;

@RestController
public class GitCollabController {
	
	@Autowired GitCollabService service;
	
	@PostMapping("/create")
	public ResponseEntity<Student>savestudent(@RequestBody Student s)
	{
		Student st=service.savaData(s);
		return new ResponseEntity<Student>(st, HttpStatus.OK);
	}
	
	@GetMapping("/getStudent")
	public ResponseEntity<Student> getStudent()
	{
		return null;
	}
	@PutMapping("/update")
	
		public ResponseEntity<Student> updateStudent()
		{
			return null;
		}
	}

