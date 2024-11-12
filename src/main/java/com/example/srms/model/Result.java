package com.example.srms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "result")
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="studentId")
    private String studentId;
	@Column(name="course")
    private String course;
	@Column(name="sem")
    private int sem;
	@Column(name="internal")
    private int internal;
	@Column(name="external")
    private int external;
	@Column(name="grade")
    private String grade;
    
	public Result() {
		
	}
	
	public Result(String studentId, String course,int sem,int internal, int external, String grade) {
		super();
		this.studentId = studentId;
		this.course = course;
		this.sem=sem;
		this.internal = internal;
		this.external = external;
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public int getInternal() {
		return internal;
	}

	public void setInternal(int internal) {
		this.internal = internal;
	}

	public int getExternal() {
		return external;
	}

	public void setExternal(int external) {
		this.external = external;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
    
	
}
