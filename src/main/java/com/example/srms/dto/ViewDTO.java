package com.example.srms.dto;

public class ViewDTO {
	private Long id;
	private String student_id;
	private String query;
	public ViewDTO() {
	}
	public ViewDTO(String student_id, String query) {
		super();
		this.student_id = student_id;
		this.query = query;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	
}
