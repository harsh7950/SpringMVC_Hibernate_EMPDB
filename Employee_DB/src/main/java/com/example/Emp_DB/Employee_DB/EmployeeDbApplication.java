package com.example.Emp_DB.Employee_DB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.example.Emp_DB.Employee_DB.EmpRepository")
@SpringBootApplication
public class EmployeeDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDbApplication.class, args);
	}
}
