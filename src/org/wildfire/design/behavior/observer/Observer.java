package org.wildfire.design.behavior.observer;

public abstract class Observer {
	public Subject subject;
	public abstract void update();
}
