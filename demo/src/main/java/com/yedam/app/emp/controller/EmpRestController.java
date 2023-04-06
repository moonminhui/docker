package com.yedam.app.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

//@Controller
@RestController // (Rest) 해당 클래스 내의 모든 메소드는 페이지를 반환하지 x
public class EmpRestController {
	@Autowired
	EmpService empService;

	@GetMapping("emps")
	//@ResponseBody
	public List<EmpVO> allList() {
		return empService.getAllList();
	}
	
	@GetMapping("emps/{empId}")
	//@ResponseBody
	public EmpVO info(@PathVariable int empId) {
		return empService.getEmpInfo(empId);
	}
}
