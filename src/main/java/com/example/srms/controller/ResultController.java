package com.example.srms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.srms.dto.ResultDTO;
import com.example.srms.service.ResultService;
import com.example.srms.model.Result;
import com.example.srms.repository.ResultRepository;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/result")
public class ResultController {
	@Autowired
	private ResultService resultService;
	@Autowired 
	private ResultRepository resultRepository;
	@PostMapping(path="/save")
	public String saveStudent(@RequestBody ResultDTO resultDTO) {
		 String id = resultService.addResult(resultDTO);
	     return id;
	}
	@PostMapping(path="/fetch")
	public ResponseEntity<List<Result>> getResultsForSemester(@RequestBody Map<String, Object> requestData) {
		int semester = Integer.parseInt(requestData.get("sem").toString());
        String student_id = (String) requestData.get("student_id");
        List<Result> results = resultRepository.findBySemAndStudentId(semester,student_id);
        return ResponseEntity.status(HttpStatus.OK).body(results);
    }
	@PostMapping(path="/fetches")
	public ResponseEntity<List<Result>> getResultsForSemesters(@RequestBody Map<String, Object> requestData) {
		int semester = Integer.parseInt(requestData.get("sem").toString());
        String student_id = (String) requestData.get("student_id");
        String course= (String)requestData.get("course");
        List<Result> results = resultRepository.findBySemAndStudentIdAndCourse(semester,student_id,course);
        return ResponseEntity.status(HttpStatus.OK).body(results);
    }
	
}
