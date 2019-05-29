package com.csc.controller;

import com.csc.dto.StudentDTO;
import com.csc.service.StudentService;
import com.csc.vo.StudentVO;

public class StudentController {
	private StudentService service;

	public void setService(StudentService service) {
		this.service = service;
	}

	public String processStudent(String sno, String sname, String m1, String m2, String m3) throws Exception {
		// create vo object
		StudentVO vo = null;
		StudentDTO dto = null;
		vo = new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		// create dto object
		dto = new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		// use service
		return service.generateResult(dto);
	}

}
