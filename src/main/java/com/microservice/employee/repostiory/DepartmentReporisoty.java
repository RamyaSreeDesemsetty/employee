package com.microservice.employee.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.employee.entity.Departments;

@Repository
public interface DepartmentReporisoty extends JpaRepository<Departments, Long> {

	Departments findByDepartmentId(Long departmentId);

}
