package com.SimpleLinkedList1;
import java.util.*;
public class LinkedList__Demo1 {
	public static void main(String[] ar) {
		LinkedList<Object> ram=new LinkedList<>();
		ram.add("Ram");
		ram.add(0,"Sita");
		ram.add(11);
		ram.add(11.11);
		ram.add(21.21f);
		ram.add(true);
		ram.add('r');
		ram.add(3200);
		ram.add("Ram");
		ram.add(null);
		ram.add(1000000000000000000L);
		System.out.println(ram);
		
	}

}
