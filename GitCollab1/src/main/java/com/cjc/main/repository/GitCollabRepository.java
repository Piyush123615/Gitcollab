package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Student;

public interface GitCollabRepository extends JpaRepository<Student, Integer>{

}
