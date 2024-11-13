package com.microservice.employee.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.employee.entity.Employees;

@Repository
public interface EmployeeRepostiory extends JpaRepository<Employees, Long> {

}
