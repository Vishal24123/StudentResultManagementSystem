package com.example.srms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.srms.dto.LoginDTO;
import com.example.srms.dto.TeacherDTO;
import com.example.srms.model.Teacher;
import com.example.srms.service.TeacherService;
import com.example.srms.repository.TeacherRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/teacher")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private TeacherRepository teacherRepository;
	
	@PostMapping(path="/save")
	public String saveStudent(@RequestBody TeacherDTO teacherDTO) {
		 String id = teacherService.addTeacher(teacherDTO);
	     return id;
	}
	@PostMapping(path="/login")
    public ResponseEntity<String> loginFaculty(@RequestBody LoginDTO loginDTO)
    {
		Teacher teacher = teacherRepository.findByUsername(loginDTO.getUsername());

        // Check if teacher exists and password matches
        if (teacher != null) {
        	if(loginDTO.getPassword().equals(teacher.getPassword())) {
        		return ResponseEntity.ok("success");
        }
        	else {
                return ResponseEntity.ok("Incorrect password");
            }
            
        }
        else {
        	return ResponseEntity.ok("Username does not exist or incorrect password");
        }
    }
}
