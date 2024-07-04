package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.GitCollabService;

@RestController
public class GitCollabController 
{
	
	@Autowired GitCollabService service;


	@PostMapping("/createstudent")
	public ResponseEntity<Student>createstudent(@RequestBody Student s){
		
		return null;
	}

	
	  @GetMapping("/getStudent")
	  public ResponseEntity<List<Student>> getAllStudent()
	  {
		  return null;
	  }


	
	@PutMapping("/updateData")
	public String updateDataUser(@PathVariable Student stu )
	{
		return null;
	}
	
	}

