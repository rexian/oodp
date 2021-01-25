package org.wildfire.design.creation.singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		SingletonObject object = SingletonObject.getInstance();
		object.showMessage();
	}

}
