package com.microservice.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeesDto {
	private Long employeeId;
	private String name;
	private String email;
	private String position;
	private double salary;

	private Long departmentId;

}
