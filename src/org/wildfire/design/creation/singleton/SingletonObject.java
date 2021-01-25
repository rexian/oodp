package org.wildfire.design.creation.singleton;

/**
 * The singleton implementation supports lazy instantiation of the class.
 * The object is performance efficient and thread safe as the lock is applied only for instance creation,
 * 
 * @author surajitpaul
 *
 */
public class SingletonObject {

	private static SingletonObject instance = null;
	
	private SingletonObject() {}
	
	/**
	 * A client requesting an instance of the class can still access the instance 
	 * without waiting for any other thread
	 * @return
	 */
	public static SingletonObject getInstance() {
		if(instance == null) {
			synchronized(SingletonObject.class) {
				instance = new SingletonObject();
			}
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("This is Singleton object");
	}
}
