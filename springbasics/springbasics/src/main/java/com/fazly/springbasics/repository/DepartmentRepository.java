package com.fazly.springbasics.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fazly.springbasics.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String>{
	Optional<Department> findBySection(String section);
}