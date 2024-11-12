package com.org.java.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class College {
	
	@Id
	@GeneratedValue
	private int collegeId;
	private String collegeName;
	private String location;
	private String university;
	private int totalStudents;

}
