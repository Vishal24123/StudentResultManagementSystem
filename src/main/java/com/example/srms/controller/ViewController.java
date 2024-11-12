package com.example.srms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.srms.dto.ViewDTO;
import com.example.srms.model.View;
import com.example.srms.repository.ViewRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/query")
public class ViewController {
	@Autowired
	private ViewRepository viewRepository;
	@PostMapping("/view")
	public ResponseEntity<List<View>> getQuery(){
		List<View> views= viewRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(views);
	}
	@PostMapping("/save")
	public String savequery(@RequestBody ViewDTO viewDTO) {
		View view=new View(viewDTO.getStudent_id(),viewDTO.getQuery());
		viewRepository.save(view);
	    return "success";
	}
}
