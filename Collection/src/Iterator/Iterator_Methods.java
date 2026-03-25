package com.Methods;
import java.util.*;
public class Iterator_Methods {
	

	    public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

	        System.out.println("Using iterator():");
	        // 1️⃣ iterator() → allows forward traversal (one direction)
	        Iterator<String> itr = fruits.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        System.out.println("\nUsing listIterator():");
	        // 2️⃣ listIterator() → allows forward & backward traversal
	        ListIterator<String> listItr = fruits.listIterator();

	        // Forward direction
	        System.out.println("Forward:");
	        while (listItr.hasNext()) {
	            System.out.println(listItr.next());
	        }

	        // Backward direction
	        System.out.println("Backward:");
	        while (listItr.hasPrevious()) {
	            System.out.println(listItr.previous());
	        }
	    }
	

}
