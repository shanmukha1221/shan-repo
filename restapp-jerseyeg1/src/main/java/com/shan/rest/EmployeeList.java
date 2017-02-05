package com.shan.rest;

import java.util.List;

public class EmployeeList {

	public List<Employee> employees;

	@Override
	public String toString() {
		return "EmployeeList [employees=" + employees + "]";
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
