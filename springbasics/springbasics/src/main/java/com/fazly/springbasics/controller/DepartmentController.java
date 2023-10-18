package com.fazly.springbasics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fazly.springbasics.model.Department;
import com.fazly.springbasics.service.DepartmentService;


@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/hello")
	public String sayHello() {
		return departmentService.sayHello();
	}
	
	@GetMapping("/get")
	public List<Department> getAllDepartments()
	{
		return departmentService.getAllDepartments();
	}
	
	@PostMapping("/save")
	public String saveUser(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
}
