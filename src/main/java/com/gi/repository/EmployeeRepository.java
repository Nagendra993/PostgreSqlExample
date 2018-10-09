package com.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gi.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String>{

	
}
