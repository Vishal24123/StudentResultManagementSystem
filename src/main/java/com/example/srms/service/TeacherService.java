package com.example.srms.service;

import org.springframework.stereotype.Service;

import com.example.srms.dto.TeacherDTO;

@Service
public interface TeacherService {
	 String addTeacher(TeacherDTO teacherDTO);
}
