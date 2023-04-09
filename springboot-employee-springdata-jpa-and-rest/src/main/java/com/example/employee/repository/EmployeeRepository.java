package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.employee.entity.Employee;

//by default, spring data rest will create endpoints based on entity types
//first character of the Entity type is lowercase & then it just adds an 's' to the entity. for example, employees for entity Employee
//if we want to give a custom name other than the entity name then we add the below annotation
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
