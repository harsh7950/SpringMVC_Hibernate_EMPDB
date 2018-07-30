package com.example.Emp_DB.Employee_DB.EmpRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Emp_DB.Employee_DB.Model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

	
}
