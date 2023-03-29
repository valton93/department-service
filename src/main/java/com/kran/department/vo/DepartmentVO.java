package com.kran.department.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentVO {
	private Long id;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
