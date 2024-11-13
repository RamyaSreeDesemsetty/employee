package com.microservice.employee.service.impl;

import org.springframework.stereotype.Service;

import com.microservice.employee.dto.DepartmentDto;
import com.microservice.employee.entity.Departments;
import com.microservice.employee.mapper.DepartmentMapper;
import com.microservice.employee.repostiory.DepartmentReporisoty;
import com.microservice.employee.service.IDepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService {

	private DepartmentReporisoty departmentReporisoty;

	@Override
	public void addDepartment(DepartmentDto departmentDto) {
		Departments departments = DepartmentMapper.mapToDepartment(departmentDto, new Departments());
		departmentReporisoty.save(departments);
	}

}
