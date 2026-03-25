package com.Methods;
import java.util.*;

public class toArray__Methods__CloneList {
public static void main(String arrr[]) {
	
	ArrayList<String> ar=new ArrayList<>();
    ar.add("Ram");
    ar.add("Shyam");
    ar.add("Hari");
    ar.add("Om");
    
    //Using toArray()
    Object[] objArray=ar.toArray();
    System.out.println("Using toArray():");
    for(Object obj:objArray) {
    	System.out.println(obj);
    	
    }
    
    //Using toArray(T[] a)

    String[] strArray=ar.toArray(new String[0]);
    System.out.println("Using toArray(T[] a):");
    	for(String s:strArray)
    	{
    		System.out.println(s);
    	}
    
    ArrayList<String> clonedList=(ArrayList<String>) ar.clone();
    System.out.println("Clones list:");
    for(String s:clonedList)
    {
    	System.out.println(s);
    }    
    ar.add("Hanuman");
    System.out.println("\n After modifying original list:");
    System.out.println("Original list:"+ar);
    System.out.println("Cloned List:"+clonedList);
    
    
    
    
}
	
	
}
