package com.microservice.employee.service;

import com.microservice.employee.dto.DepartmentDto;
import com.microservice.employee.dto.EmployeesDto;

public interface IEmployeeService {

	void addEmployee(EmployeesDto empDto);

	DepartmentDto getDepartmentByEmployeeId(Long id);

}
