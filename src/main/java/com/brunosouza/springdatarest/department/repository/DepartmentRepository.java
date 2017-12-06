package com.brunosouza.springdatarest.department.repository;

import org.springframework.data.repository.CrudRepository;

import com.brunosouza.springdatarest.department.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
