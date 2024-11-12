package com.example.srms.dto;


public class StudentDTO {
	private long id;
	private String name;
	private String username;
	private String password;
	private String studentid;
	
	  public StudentDTO() {
	  }
		
	public StudentDTO(long id, String name, String username, String password,String studentid) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.studentid=studentid;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
