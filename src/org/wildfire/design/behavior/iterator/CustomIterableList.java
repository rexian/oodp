package org.wildfire.design.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomIterableList<T> implements Iterable<T> {
	
	private List<T> myList = new ArrayList<>();
	
	public void add(T val) {
		myList.add(val);
	}

	
	public Iterator<T> iterator() {
		return new CustomIterator<T>(myList);
	}
	
	public class CustomIterator<E> implements Iterator<E>{
		int index = 0;
		List<E> internalList;
		
		public CustomIterator(List<E> list) {
			this.internalList = list;
		}
		
		public boolean hasNext() {
			if(internalList.size() >= index + 1) {
				return true;
			}
			return false;
		}

		public E next() {
			E val = internalList.get(index);
			index++;
			return val;
		}
	}
}
