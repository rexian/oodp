package org.wildfire.design.behavior.state;

public class AdultState implements HumanState {

	public void eat() {
		System.out.println("Adult human eats all kinds of edible food.");
	}

	public void move() {
		System.out.println("Adult human walk and run very fast.");
	}

}
