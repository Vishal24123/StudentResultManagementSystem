package com.example.srms.service;

import java.util.List;

import com.example.srms.dto.ResultDTO;
import com.example.srms.model.Result;

public interface ResultService {
	 String addResult(ResultDTO resultDTO);
	 String updateResult(ResultDTO resultDTO);
	 List<Result> getResultsForSemester(int semester,String student_id);
}
