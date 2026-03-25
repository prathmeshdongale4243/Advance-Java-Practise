package com.HashMapSample;
import java.util.*;


public class CreateHashMap1 
{
	public static void main(String[] ar) {
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1,"Ram");
hm.put(2,"Shyam");
hm.put(3,"Om");	
hm.put(4,"Hari");
hm.put(5,"Shiv");
hm.put(6,"ShivDatta");
hm.put(7,"Guru Data");
hm.put(null,"samarth");
hm.put(8,null);
hm.put(9,null);

HashMap<Integer,String> map=new HashMap<Integer,String>(hm);
map.put(10,"Ram");
map.put(11,"Shyam");
map.put(12,"Om");	

for(Map.Entry<Integer,String> m:map.entrySet())
{
	System.out.println(m.getKey()+" = "+m.getValue());
}
	
	}
	
	
	
	
	
	
	
	
	
}
