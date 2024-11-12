package com.example.srms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.srms.dto.TeacherDTO;
import com.example.srms.model.Teacher;
import com.example.srms.repository.TeacherRepository;


@Service
public class TeacherImpl implements TeacherService{
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public String addTeacher(TeacherDTO teacherDTO) {
		Teacher teacher = new Teacher(
				teacherDTO.getName(),
				teacherDTO.getUsername(),
                teacherDTO.getPassword(),
                teacherDTO.getDesignation()
        );
		teacherRepository.save(teacher);
		return teacher.getName();
	}
}
