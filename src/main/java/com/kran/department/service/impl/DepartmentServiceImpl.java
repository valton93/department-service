package com.kran.department.service.impl;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.kran.department.entity.Department;
import com.kran.department.repository.DepartmentRepository;
import com.kran.department.service.DepartmentService;
import com.kran.department.vo.DepartmentVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional(readOnly = true)
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	@Transactional
	public Department saveDepartment(DepartmentVO modelVO) {
		log.info("inside SaveDepartment method of DepartmentService");
		Gson gson = new Gson();
		Department model = gson.fromJson(gson.toJson(modelVO), Department.class);
		return departmentRepository.save(model);
	}

	@Override
	public DepartmentVO findDepartmentById(Long departmentId) {
		log.info("inside findDepartmentById method of DepartmentService");
		Optional<Department>deptOpt= departmentRepository.findDepartmentById(departmentId);
		if(deptOpt.isPresent()) {
		Gson gson = new Gson();
		DepartmentVO modelVO = gson.fromJson(gson.toJson(deptOpt.get()), DepartmentVO.class);
		return modelVO;
		}
		return null;
	}
	
	
}
