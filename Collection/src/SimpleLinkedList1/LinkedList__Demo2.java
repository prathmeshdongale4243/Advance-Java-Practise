package com.SimpleLinkedList1;
import java.util.*;
public class LinkedList__Demo2 {
	public static void main(String[] ar) {
		LinkedList<Integer> rami=new LinkedList<>();
		rami.add(11);
		rami.add(21);
		System.out.println("Integer Array="+rami);
		
		LinkedList<String> rams=new LinkedList<>();
		rams.add("Ram");
		rams.add("Shyam");
		System.out.println("Integer Array="+rams);
	
		LinkedList<Character> ramc=new LinkedList<>();
		ramc.add('o');
		ramc.add('m');
		System.out.println("Integer Array="+ramc);
		
		LinkedList<Boolean> ramb=new LinkedList<>();
		ramb.add(true);
		ramb.add(false);
		System.out.println("Integer Array="+ramb);
	
		LinkedList<Short> ramsh=new LinkedList<>();
		ramsh.add((short)1);
		ramsh.add((short)121);
		ramsh.add(null);
		System.out.println("Integer Array="+ramsh);
		
		LinkedList<Float> ramf=new LinkedList<>();
		ramf.add(12.12f);
		ramf.add(21.21f);
		System.out.println("Integer Array="+ramf);
		
		LinkedList<Byte> ramby=new LinkedList<>();
		ramby.add((byte)12.12);
		//ramf.add(21.21f);
		System.out.println("Integer Array="+ramby);
		
		LinkedList<String[]> ramsa=new LinkedList<>();
		ramsa.add(new String[]{"Ram","Shyam"});
		String[] a= {"Om","Shiv"};
		ramsa.add(a);
		for(int i=0;i<ramsa.size();i++) {
			System.out.println(Arrays.toString(ramsa.get(i)));
		}
		
		
	
	
	
	
	
	
	
	}

}
