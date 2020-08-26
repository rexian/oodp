package org.wildfire.design.creation.factory;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		
		if(shapeType == null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circular();
		}
		else if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangular();
		}
		return null;
	}
}
