package com.Methods;
import java.util.*; 
public class IteratorDemo {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("Original list: " + list);

        // Forward traversal using Iterator
        Iterator<String> itr = list.iterator();
        System.out.print("Forward traversal: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Remove element using Iterator
        itr = list.iterator();
        while (itr.hasNext()) {
            String fruit = itr.next();
            if (fruit.equals("Banana")) {
                itr.remove(); // Safe removal
            }
        }
        System.out.println("After removing 'Banana': " + list);

        // ❌ Cannot add or replace using Iterator
        // ❌ Cannot get index using Iterator
    }



}
