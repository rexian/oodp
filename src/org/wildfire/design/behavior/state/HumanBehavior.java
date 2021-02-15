package org.wildfire.design.behavior.state;

public class HumanBehavior {

	public static void main(String[] args) {
		
		Human human = new Human(1);
		human.eat();
		human.move();
		
		human = new Human(3);
		human.eat();
		human.move();
		
		human = new Human(15);
		human.eat();
		human.move();
		
		human = new Human(25);
		human.eat();
		human.move();

	}
}
