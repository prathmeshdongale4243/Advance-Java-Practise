package com.HashMapSample;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
public static void main(String[] ar)
{
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
HashMap<Integer,String> map1=(HashMap<Integer,String>)map.clone();//clone
	map.clear();                                                    //clear
	System.out.println(" New copy hashmap ");
	
	
for(Map.Entry<Integer,String> m:map1.entrySet())
{
	System.out.println(m.getKey()+" = "+m.getValue());
}	

System.out.println("Maps keys ="+(map1.keySet()));//keySet()
System.out.println("Put all method map1 put all in 'map2'");

HashMap<Integer,String> map2=new HashMap<Integer,String>();
map2.putAll(map1);                                   //putAll()
map2.put(12, "Pandurang");
map2.put(13," Rakhumai");
for(Map.Entry<Integer,String> m:map2.entrySet())
{
	System.out.println(m.getKey()+" = "+m.getValue());
}

System.out.println("chech '10' key is present or not in map 2 "+map2.containsKey(10));
System.out.println("chech '10' key is present or not in map 2 "+map2.containsValue("Ram"));

System.out.println("remove key value pair using 'key' "+map2.remove(3));
	




Map<String, Integer> ma = new HashMap<>();
ma.merge("apple", 10, (oldVal, newVal) -> oldVal + newVal); 
ma.put("apple", 10);
System.out.println(ma);

ma.merge("apple", 5, (oldVal, newVal) -> oldVal + newVal); 
ma.put("banana", null);
System.out.println(ma);

ma.merge("banana", 20, (oldVal, newVal) -> oldVal + newVal);
System.out.println(ma);


ma.put("mango", 5);
ma.merge("mango", 5, (oldVal, newVal) -> null);
ma.merge("orange ", 9, (oldVal, newVal) -> null);
System.out.println(ma);





}
}
