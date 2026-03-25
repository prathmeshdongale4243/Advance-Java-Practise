package com.ExSet;
import java.util.*;
public class ExTreeSet {
	public static void main(String ar[]) {
	TreeSet<Integer> tr=new TreeSet<>();
	tr.add(10);
	tr.add(2);
	tr.add(7);
	tr.add(1);
	tr.add(64);
	//tr.add(null); get error
	System.out.println(tr);
	//TreeSet not allow null valuse
	//and it return element in sorted form
	
	//TreeSet<Object> ts=new TreeSet<>();
	//ts.add(10);
	//ts.add("Ram");
	//ts.add(7.1);
	//ts.add(1.1f);
	//ts.add(true);
	//System.out.println(ts);
	//above are not allowed because treeset sorted the element so different type cannot be sort
	}
	
	

}
