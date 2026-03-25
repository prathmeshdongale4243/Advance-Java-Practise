package com.Methods;
import java.util.*;
public class ListIteratorDemo {
	
		

		
		    public static void main(String[] args) {
		        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
		        System.out.println("Original list: " + list);

		        ListIterator<String> listItr = list.listIterator();

		        // 1️⃣ Forward traversal + replace
		        while (listItr.hasNext()) {
		            String fruit = listItr.next();
		            if (fruit.equals("Banana")) {
		                listItr.set("Mango"); // replace Banana -> Mango
		            }
		        }
		        System.out.println("After replacing 'Banana' with 'Mango': " + list);

		        // 2️⃣ Backward traversal
		        System.out.print("Backward traversal: ");
		        while (listItr.hasPrevious()) {
		            System.out.print(listItr.previous() + " ");
		        }
		        System.out.println();

		        // 3️⃣ Add element at current position
		        listItr = list.listIterator(1); // start at index 1
		        listItr.add("Grapes"); // add element
		        System.out.println("After adding 'Grapes' at index 1: " + list);

		        // 4️⃣ Know current index
		        System.out.println("Next index: " + listItr.nextIndex());
		        System.out.println("Previous index: " + listItr.previousIndex());

		        // 5️⃣ Remove element using ListIterator
		        while (listItr.hasNext()) {
		            String fruit = listItr.next();
		            if (fruit.equals("Cherry")) {
		                listItr.remove();
		            }
		        }
		        System.out.println("After removing 'Cherry': " + list);
		    }
		


	

}
