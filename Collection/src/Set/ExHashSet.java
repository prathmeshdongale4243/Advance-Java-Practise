package com.ExSet;
import java.util.*;
public class ExHashSet {
public static void main(String ar[]) {
	
	HashSet<Object> hs=new HashSet<>();
	hs.add(100);
	hs.add("Ram");
	hs.add(11.11);
	hs.add(11.111f);
	hs.add(100);//not duplicate allow
	hs.add(null);
	hs.add(null);//only single null value can add
	System.out.println(hs);
	
	
	
	

}
}
