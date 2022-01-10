/**
 * 
 */
package org.niranzan.datastucture.array;

import java.util.Iterator;

/**
 * @author Dell
 *
 */

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T>{
	private T[] array;
	private int size;
	private int capacity;
	
	public DynamicArray() {
		this.capacity = 10;
		this.size = 0;
	}

	public DynamicArray(int capacity) {
		if (capacity < 0) throw new IllegalArgumentException("Invalid parameter capacity: " + capacity);
		this.capacity = capacity;
		array = (T[]) new Object[capacity];
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return capacity;
	}
	
	public void enlargeArray() {
		if (size + 1 > capacity) {
			capacity *= 2;
			T[] nArray = (T[]) new Object[capacity];
			for (int i = 0; i <= size; i++) {
				nArray[i] = array[i];
			}
			array = nArray;
		}
	}
	
	public T add(T element) {
		enlargeArray();
		array[size] = element;
		size++;
		return element;
	}
	
	public T insert(int index, T element) {
		enlargeArray();
		for (int i = size - 1; i >= index; i--) {
			array[i+1] = array[i];
		}
		array[index] = element;
		size++;
		return element;
	}
	
	public T replace(int index, T element) {
		T oElement = array[index];
		array[index] = element;
		return oElement;
	}
	
	public T get(int index) {
		if (index > size - 1) throw new IndexOutOfBoundsException();
		return array[index];
	}

	public void shrinkArray(int start) {
		for (int i = start; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		--size;
	}
	
	public T remove(int index) {
		if (index > size - 1) throw new IndexOutOfBoundsException();
		T element = array[index];
		shrinkArray(index);
		return element;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public String toString() {
		StringBuffer output = new StringBuffer("[");
		for (int i = 0; i <= size - 1; i++) {
			if (i != 0) output.append(",");
			output.append((T) array[i]);
		}
		output.append("]");
		return output.toString();
	}
}
