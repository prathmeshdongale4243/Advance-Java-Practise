package com.Methods;
import java.util.*;
public class Methods1 {
	
	    public static void main(String[] args) {
	        // Create ArrayList with default capacity (10)
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add some elements
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);

	        System.out.println("Initial list: " + numbers);

	        // 1️⃣ get(int index) → fetch element by index
	        System.out.println("Element at index 1: " + numbers.get(3));  // 20

	        // 2️⃣ isEmpty() → check if list is empty
	        System.out.println("Is list empty? " + numbers.isEmpty());  // false

	        // 3️⃣ ensureCapacity(int requiredCapacity)
	        // increases internal storage capacity (not visible in output)
	        numbers.ensureCapacity(20);
	        System.out.println("ensureCapacity(20) called. Capacity increased internally.");

	        // 4️⃣ clear() → remove all elements
	        numbers.clear();
	        System.out.println("After clear(): " + numbers);

	        // Check again if list is empty
	        System.out.println("Is list empty now? " + numbers.isEmpty());  // true
	    }
	

}
