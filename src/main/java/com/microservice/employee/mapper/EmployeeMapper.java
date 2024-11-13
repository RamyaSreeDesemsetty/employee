package com.microservice.employee.mapper;

import com.microservice.employee.dto.EmployeesDto;
import com.microservice.employee.entity.Employees;

public class EmployeeMapper {

	public static Employees mapToEmployee(EmployeesDto empDto, Employees employee) {
		employee.setEmployeeId(empDto.getEmployeeId());
		employee.setName(empDto.getName());
		employee.setEmail(empDto.getEmail());
		employee.setPosition(empDto.getPosition());
		employee.setSalary(empDto.getSalary());
		employee.setDepartmentId(empDto.getDepartmentId());
		return employee;
	}

	public static EmployeesDto mapToEmployeeDto(Employees employee, EmployeesDto employeeDto) {
		employeeDto.setEmployeeId(employee.getEmployeeId());
		employeeDto.setName(employee.getName());
		employeeDto.setEmail(employee.getEmail());
		employeeDto.setPosition(employee.getPosition());
		employeeDto.setSalary(employee.getSalary());
		employeeDto.setDepartmentId(employee.getDepartmentId());
		return employeeDto;
	}

}
