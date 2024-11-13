package com.microservice.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.employee.dto.DepartmentDto;
import com.microservice.employee.dto.EmployeesDto;
import com.microservice.employee.service.IEmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/employees")
public class EmployeeController {

	private IEmployeeService iEmployeeService;

	@PostMapping("/create")
	public void createEmployee(@RequestBody EmployeesDto empDto) {
		iEmployeeService.addEmployee(empDto);
	}

	@GetMapping("/{id}/department")
	public ResponseEntity<DepartmentDto> getEmployeeDepartment(@PathVariable Long id) {
		DepartmentDto departmentDto = iEmployeeService.getDepartmentByEmployeeId(id);
		if (departmentDto != null) {
			return new ResponseEntity<>(departmentDto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
