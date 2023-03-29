package com.kran.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kran.department.entity.Department;
import com.kran.department.service.DepartmentService;
import com.kran.department.vo.DepartmentVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody DepartmentVO departmentVO) {
		log.info("inside SaveDepartment method of Department Controller");
		return departmentService.saveDepartment(departmentVO);
	}
	
	@GetMapping("/{id}")
	public DepartmentVO findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("inside findDepartmentById method of Department Controller");
		return departmentService.findDepartmentById(departmentId);
	}

}
