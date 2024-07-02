package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.GitCollabRepository;
import com.cjc.main.service.GitCollabService;

@Service
public class GitCollabServiceImpl implements GitCollabService{

	@Autowired GitCollabRepository repository;
	
	@Override
	public Student savaData(Student s) {
		
		Student st=repository.save(s);
		return st;
	}

	
}
