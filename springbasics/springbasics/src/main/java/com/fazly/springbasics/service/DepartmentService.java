package com.fazly.springbasics.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazly.springbasics.model.Department;
import com.fazly.springbasics.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
public String sayHello() {
	return "Hello";
}
public String saveDepartment(Department department) {
	Optional<Department> isDepartment=departmentRepository.findBySection(department.getSection());
	if(!isDepartment.isPresent()) {
		departmentRepository.save(department);
		return "Department saved Successfully";
	}
	else{
		return "Department already exists by section: "+department.getSection();
		
	}
}
public List<Department> getAllDepartments(){
	return departmentRepository.findAll();
}
}