/**
 * 
 */
package org.niranzan.datastucture.array;

/**
 * @author Dell
 *
 */
public class DynamicArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DynamicArray<Integer> integers = new DynamicArray<>(10);
		System.out.println("New Element :: " + integers.add(10));
		System.out.println("New Element :: " + integers.add(20));
		System.out.println("New Element :: " + integers.add(40));

		System.out.println("New Element :: " + integers.insert(2, 30));
		System.out.println("After insert :: " + integers);
		
		System.out.println("Old Element at index 0 :: " + integers.replace(0, 100));
		System.out.println("After replace :: " + integers);

		System.out.println("Removed Element from index 1 :: " + integers.remove(1));
		System.out.println("After remove :: " + integers);

		System.out.println(integers);

		System.out.println("Item at 2 :: " + integers.get(2));
	}

}
