package com.example.srms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.srms.model.Teacher;

@EnableJpaRepositories
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
	Teacher findByUsername(String username);
}
