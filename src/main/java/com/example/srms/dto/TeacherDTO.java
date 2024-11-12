package com.example.srms.dto;

public class TeacherDTO {
	private long id;
	private String name;
	private String username;
	private String password;
	private String designation;
	
	  public TeacherDTO() {
	  }
		
	public TeacherDTO(long id, String name, String username, String password,String designation) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.designation=designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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
