package org.wildfire.design.structure.composite;

import java.util.LinkedList;
import java.util.Queue;

public class CompositeDesignPatternClient {

	public static void main(String[] args) {
		
		Employee ceo = new Employee("John", "CEO", 100000.00);
		
		Employee vpIT = new Employee("Richard", "IT", 95000.00);
		Employee vpSales = new Employee("Nick", "Sales", 90000.00);
		Employee vpOperations = new Employee("Matt", "Operations", 80000.50);
		
		ceo.addSubordinate(vpIT);
		ceo.addSubordinate(vpSales);
		ceo.addSubordinate(vpOperations);
		
		Employee directorSales1 = new Employee("Nicole", "Sales", 60000.80);
		Employee directorSales2 = new Employee("Jennifer", "Sales", 60000.50);
		vpSales.addSubordinate(directorSales1);
		vpSales.addSubordinate(directorSales2);
		
		Employee directorOperations1 = new Employee("Rumel", "Operations", 50000.35);
		Employee directorOperations2 = new Employee("Kevin", "Operations", 50000.50);
		vpOperations.addSubordinate(directorOperations1);
		vpOperations.addSubordinate(directorOperations2);
		
		
		Queue<Employee> q = new LinkedList<>();
		q.offer(ceo);
		
		while(!q.isEmpty()) {
			Employee e = q.poll();
			System.out.println(e.toString());
			
			for(Employee emp: e.getSubordinates()) {
				q.offer(emp);
			}
		}
	}
}
