package com.ExSet;
import java.util.*;
public class studentHashSet {
	public static void main(String er[]) {
		HashSet<student> hss=new HashSet<>();
		hss.add(new student(1,"Ram"));
		hss.add(new student(2,"Shyam"));
		hss.add(new student(3,"Om"));
		hss.forEach(System.out::println);
		System.out.println(hss);
		
	}

}
