package com.ExSet;
import java.util.*;

public class userLinkedHashSet {
	
public static void main(String ar[]) {
	LinkedHashSet<user> hs=new LinkedHashSet<>();
	hs.add(new user(1,"Ram"));
	hs.add(new user(2,"Shyam"));
	hs.add(new user(3,"Om"));
	hs.forEach(System.out::println);
	
	
}
	
	
	
}
