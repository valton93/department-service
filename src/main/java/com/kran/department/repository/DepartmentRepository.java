package com.kran.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kran.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
