package com.ArrayListPassInterface;
import java.util.*;
public class app {
public static void main(String ar[]) {
	ArrayList<Test> al=new ArrayList<Test>();
	al.add(new Ram(1,"Ram"));
	al.add(new Ram(2,"Shyam"));
	al.add(new Ram(3,"Sita"));
	
	al.forEach(System.out::println);
}
}
