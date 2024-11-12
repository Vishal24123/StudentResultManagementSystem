package com.example.srms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.srms.dto.StudentDTO;
import com.example.srms.model.Student;
import com.example.srms.repository.StudentRepository;

@Service
public class StudentImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public String addStudent(StudentDTO studentDTO) {
		Student student = new Student(
				studentDTO.getName(),
				studentDTO.getUsername(),
                studentDTO.getPassword(),
                studentDTO.getStudentid()
        );
		studentRepository.save(student);
		return student.getName();
	}
	
}
