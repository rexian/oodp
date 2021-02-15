package org.wildfire.design.behavior.iterator;

public class CustomIteratorClient {

	public static void main(String[] args) {
		CustomIterableList<String> list = new CustomIterableList<>();
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		
		for(String day: list) {
			System.out.println("Day: " + day);
		}
		
		CustomIterableList<Integer> numericValues = new CustomIterableList<>();
		numericValues.add(1);
		numericValues.add(2);
		numericValues.add(3);
		numericValues.add(4);
		numericValues.add(5);
		numericValues.add(6);
		numericValues.add(7);
		numericValues.add(8);
		numericValues.add(9);
		numericValues.add(10);
		
		for(Integer day: numericValues) {
			System.out.println("Day: " + day);
		}
	}
}
