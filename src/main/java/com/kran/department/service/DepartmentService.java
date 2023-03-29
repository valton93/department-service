package com.kran.department.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kran.department.entity.Department;
import com.kran.department.vo.DepartmentVO;

public interface DepartmentService {

	public Department saveDepartment(DepartmentVO modelVO);
	
	public DepartmentVO findDepartmentById(Long departmentId);
	

}
