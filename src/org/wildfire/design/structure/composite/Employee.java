package org.wildfire.design.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String department;
	private double salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.subordinates = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void addSubordinate(Employee subordinate) {
		subordinates.add(subordinate);
	}
	
	public void removeSubordinate(Employee subordinate) {
		subordinates.remove(subordinate);
	}
 
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
}
