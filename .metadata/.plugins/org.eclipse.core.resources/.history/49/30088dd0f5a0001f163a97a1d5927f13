package com.org.java.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.org.java.entity.College;
import com.org.java.repository.CollegeRepository;
import com.org.java.service.CollegeService;

@Component
public class CollegeServiceImpl implements CollegeService {
	
	/*
	 * @Value("${microservice.college-service.endpoints.endpoint.uri:}") private
	 * String ENDPOINT_URL;
	 */
	
	@Autowired
	private CollegeRepository collegeRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public College saveCollegeDetails(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public List<College> findAllCollegeDetails() {
		// TODO Auto-generated method stub
		List<College> list=collegeRepository.findAll();
		return list;
	}

	@Override
	public Object[] getCollegeToStudentDetails() {
	//Object[] students=restTemplate.getForObject(ENDPOINT_URL, Object[].class);
	Object[] students=restTemplate.getForObject("http://localhost:2023/student/findAll", Object[].class);
		return students;
	}

}
