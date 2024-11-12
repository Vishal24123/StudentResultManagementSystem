package com.example.srms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.srms.dto.ResultDTO;
import com.example.srms.model.Result;
import com.example.srms.repository.ResultRepository;

@Service
public class ResultImpl implements ResultService {
	@Autowired
	private ResultRepository resultRepository;

	@Override
	public String addResult(ResultDTO resultDTO) {
		Result result=new Result(resultDTO.getStudentId(), resultDTO.getCourse(), resultDTO.getSem(), resultDTO.getInternal(), resultDTO.getExternal(), resultDTO.getGrade());
		resultRepository.save(result);
		return "Success";
	}

	@Override
	public String updateResult(ResultDTO resultDTO) {
		Result result=new Result(resultDTO.getStudentId(), resultDTO.getCourse(), resultDTO.getSem(), resultDTO.getInternal(), resultDTO.getExternal(), resultDTO.getGrade());
		resultRepository.save(result);
		return "Success";
	}
	@Override
	public List<Result>  getResultsForSemester(int semester,String student_id){
		List<Result> results=resultRepository.findBySemAndStudentId(semester,student_id);
		return results;
		
	}
}
