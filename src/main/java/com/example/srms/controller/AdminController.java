package com.example.srms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.srms.dto.LoginDTO;
import com.example.srms.model.Admin;
import com.example.srms.repository.AdminRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/admin")
public class AdminController {
	@Autowired
    private AdminRepository adminRepository;
   
    @PostMapping(path = "/login")
    public ResponseEntity<String> checkAdmin(@RequestBody LoginDTO request) {
        // Find admin by username
    	System.out.println("Received:"+request);
        Admin admin = adminRepository.findByUsername(request.getUsername());

        // Check if admin exists and password matches
        if (admin != null) {
        	if(request.getPassword().equals(admin.getPassword())) {
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
