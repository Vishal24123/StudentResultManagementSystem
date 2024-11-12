package com.example.srms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.srms.model.Result;


@EnableJpaRepositories
@Repository
public interface ResultRepository extends JpaRepository<Result, Long>{
	Optional<Result> findByStudentIdAndSem(String studentId, int sem);
	List<Result> findBySemAndStudentId(int sem,String studentId);
	List<Result> findBySemAndStudentIdAndCourse(int sem,String studentId,String course);
}
