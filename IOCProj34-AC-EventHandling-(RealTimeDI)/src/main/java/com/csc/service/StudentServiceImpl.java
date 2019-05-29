package com.csc.service;

import org.springframework.beans.BeanUtils;

import com.csc.bo.StudentBO;
import com.csc.dao.StudentDAO;
import com.csc.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		StudentBO bo = null;
		int total = 0;
		float avg = 0.0f;
		String result = null;
		int returncode = 0;

		total = dto.getM1() + dto.getM2() + dto.getM3();
		avg = total / 3;
		if (avg < 40)
			result = "fail";
		else
			result = "pass";
		bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		bo.setAvg(avg);
		bo.setTotal(total);
		bo.setResult(result);
		// use dao
		returncode = dao.insert(bo);
		if (returncode < 0)
			return "Record inserted Successfully....";
		else
			return "Record insert failed....";
	}

}
