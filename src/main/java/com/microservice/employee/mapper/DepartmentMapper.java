package com.microservice.employee.mapper;

import com.microservice.employee.dto.DepartmentDto;
import com.microservice.employee.entity.Departments;

public class DepartmentMapper {
	public static Departments mapToDepartment(DepartmentDto departmentDto, Departments departments) {
		departments.setDepartmentId(departmentDto.getDepartmentId());
		departments.setDepartmentName(departmentDto.getDepartmentName());
		return departments;
	}

	public static DepartmentDto mapToDepartmentDto(Departments departments, DepartmentDto departmentDto) {
		departmentDto.setDepartmentId(departments.getDepartmentId());
		departmentDto.setDepartmentName(departments.getDepartmentName());
		return departmentDto;
	}

}
