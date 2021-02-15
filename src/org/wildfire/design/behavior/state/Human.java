package org.wildfire.design.behavior.state;

public class Human {
	
	private int age;
	private HumanState humanState;
	
	public Human(int age) {
		super();
		this.age = age;
		this.setHumanState(age);
	}
	
	public void eat() {
		humanState.eat();
	}
	
	public void move() {
		humanState.move();
	}
	
	private void setHumanState(int age) {
		
		if(age >= 0 && age < 3) {
			this.humanState = new InfantState();
		}
		else if(age >= 3 && age < 4) {
			this.humanState = new ToddlerState();
		}
		else if(age >= 4 && age < 12) {
			this.humanState = new KidState();
		}
		else if(age >= 12 && age < 20){
			this.humanState = new AdolescentState();
		}
		else {
			this.humanState = new AdultState();
		}
	}
}
