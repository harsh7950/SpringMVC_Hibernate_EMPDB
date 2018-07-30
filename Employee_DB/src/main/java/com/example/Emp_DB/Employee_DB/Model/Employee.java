package com.example.Emp_DB.Employee_DB.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="Lastname")
	private String Lastname;
	
	@Column(name="salary")
	private int salary;
	
	
	public Employee() {
		
	}
	
	public Employee(int id, String firstname, String lastname, int salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.Lastname = lastname;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
