package com.relation.relation.repository.manytomany;

import com.relation.relation.entity.manytomany.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
