package org.wildfire.design.creation.factory;

public class FactoryPattern {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape s = factory.getShape("Circle");
		s.draw();
		
		s = factory.getShape("Rectangle");
		s.draw();
		
		s = factory.getShape("Square");
		s.draw();

	}
}
