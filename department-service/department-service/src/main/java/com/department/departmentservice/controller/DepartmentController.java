package com.department.departmentservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.departmentservice.entity.Department;
import com.department.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println(department);
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Optional<Department> finDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.findDepartmentById(departmentId);
	}
	
}
