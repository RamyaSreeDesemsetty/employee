package com.microservice.employee.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.employee.dto.DepartmentDto;
import com.microservice.employee.service.IDepartmentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/departments")
public class DepartmentController {

	private IDepartmentService iDepartmentService;

	@PostMapping("/create")
	public void createDepartment(@RequestBody DepartmentDto departmentDto) {
		iDepartmentService.addDepartment(departmentDto);
	}

}
