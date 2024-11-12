package com.example.srms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.srms.model.Student;
import com.example.srms.repository.StudentRepository;
import com.example.srms.dto.LoginDTO;
import com.example.srms.dto.StudentDTO;
import com.example.srms.service.StudentService;

@RestController
@CrossOrigin//(origins = "http://localhost:3000/studentlogin")
@RequestMapping("/api/v1/student")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private StudentService studentService;
	
	@PostMapping(path="/save")
	public String saveStudent(@RequestBody StudentDTO studentDTO) {
		 String id = studentService.addStudent(studentDTO);
	     return id;
	}
	@PostMapping(path="/login")
    public ResponseEntity<String> loginStudent(@RequestBody LoginDTO loginDTO)
    {
		Student student = studentRepository.findByUsername(loginDTO.getUsername());

        // Check if student exists and password matches
        if (student != null) {
        	if(loginDTO.getPassword().equals(student.getPassword())) {
        		return ResponseEntity.ok("success,studentId="+student.getStudentid());
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

