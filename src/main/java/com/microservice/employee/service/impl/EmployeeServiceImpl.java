package com.microservice.employee.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microservice.employee.dto.DepartmentDto;
import com.microservice.employee.dto.EmployeesDto;
import com.microservice.employee.entity.Departments;
import com.microservice.employee.entity.Employees;
import com.microservice.employee.mapper.DepartmentMapper;
import com.microservice.employee.mapper.EmployeeMapper;
import com.microservice.employee.repostiory.DepartmentReporisoty;
import com.microservice.employee.repostiory.EmployeeRepostiory;
import com.microservice.employee.service.IEmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements IEmployeeService {

	private EmployeeRepostiory employeeRepostiory;
	private DepartmentReporisoty departmentReporisoty;

	@Override
	public void addEmployee(EmployeesDto empDto) {
		Employees employees = EmployeeMapper.mapToEmployee(empDto, new Employees());
		employeeRepostiory.save(employees);
	}

	@Override
	public DepartmentDto getDepartmentByEmployeeId(Long id) {
		Optional<Employees> employees = employeeRepostiory.findById(id);
		Long departmentId = employees.get().getDepartmentId();
		Departments departments = departmentReporisoty.findByDepartmentId(departmentId);
		return DepartmentMapper.mapToDepartmentDto(departments, new DepartmentDto());
	}

}
