package com.example.srms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.srms.model.Student;

@EnableJpaRepositories
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	Student findByUsername(String username);
}
