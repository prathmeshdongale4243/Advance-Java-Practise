package com.Methods;
import java.util.*;
public class Methods2 {
	public static void main(String[] ar)
	{
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(111,222,333,444,555,666,777,888,999,555));
		System.out.println(al);
		System.out.println("First occurance="+al.indexOf(555));//prints first occurance in list
		System.out.println("last index 555="+al.lastIndexOf(555));
		 System.out.println("Check contain 111="+al.contains(111));
		 System.out.println("check contain 1111="+al.contains(1111));
	
		 System.out.println("remove element at position 2="+al.remove(2));
		 System.out.println("new after remove"+al);
	
		 al.set(1, 2222);
		 System.out.println("Update value 222 to 2222=\n"+al);
		 
		 al.add(2,333);
		 System.out.println("\nadd specific position index 2 add 333=\n"+al);
	      
		 
	
	
		 
		 
		 
	}
}
