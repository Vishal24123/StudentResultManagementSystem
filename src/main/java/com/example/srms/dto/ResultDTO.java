package com.example.srms.dto;


public class ResultDTO {
	private Long id;
	private String studentId;
	private String course;
	private int sem;
	private int internal;
	private int external;
	private String grade;
    
	public ResultDTO() {
	}
	
	public ResultDTO(String studentId, String course,int sem,int internal, int external, String grade) {
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

