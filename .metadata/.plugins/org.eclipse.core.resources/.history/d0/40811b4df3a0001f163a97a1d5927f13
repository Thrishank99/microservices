package com.org.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.java.entity.College;
import com.org.java.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping("/save")
	public ResponseEntity<College> saveCoolege(@RequestBody College college){
		College colleges=collegeService.saveCollegeDetails(college);
		return new ResponseEntity<>(colleges,HttpStatus.CREATED);	
	}
	@RequestMapping("/findAll")
	public ResponseEntity<College> findAllStudent(){
		List<College> collegesList=collegeService.findAllCollegeDetails();
		return new ResponseEntity(collegesList,HttpStatus.OK);
		
	}
	@RequestMapping("/findCollegeToStudentDetails")
	public ResponseEntity<College> findCollegeToStudentDetails(){
		Object[] studentsList=collegeService.getCollegeToStudentDetails();
		return new ResponseEntity(studentsList,HttpStatus.OK);//http://localhost:8989/college/findCollegeToStudentDetails
		
	}

}