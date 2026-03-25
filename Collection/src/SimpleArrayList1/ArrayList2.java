package SimpleArrayList1;
import java.util.*;
public class ArrayList2 {
public static void main(String[] ar) {
	ArrayList<Integer> ai=new ArrayList<Integer>();
	ai.add(10);
	ai.add(20);
	ai.add(30);
	ai.add(40);
	ai.add(50);
	ai.add(null);
    System.out.println(ai);
    
    ArrayList<String> as= new ArrayList<String>();
    as.add("Ram");
    as.add("Shyam");
    as.add("Om");
    as.add("Hari");
    as.add("Shiv");
    as.add(null);
    System.out.println(as);
    
    ArrayList<Character> ac=new ArrayList<Character>();
    ac.add('R');
    ac.add('a');
    ac.add('m');
    ac.add(null);
    System.out.println(ac);
    
    ArrayList<Boolean> ab=new ArrayList<Boolean>();
    
   ab.add(true);
   ab.add(false);
   ab.add(null);
   System.out.println(ab);
   
   ArrayList<Long> al=new ArrayList<Long>();
   al.add(1000000000000000000L);
   al.add(null);
   System.out.println(al);
   
   ArrayList<Short> ass=new ArrayList<Short>();
   ass.add((short)121);
   ass.add(null);
   System.out.println(ass);
   
   ArrayList<Float> af=new ArrayList<Float>();
   af.add(21.21f);
   af.add(11.11f);
   af.add(51.51f);
   af.add(null);
   System.out.println(af);
   
   ArrayList<Byte> aby=new ArrayList<Byte>();
   aby.add((byte)10);
   aby.add((byte)20);
   aby.add(null);
   System.out.println(aby);
   
   ArrayList<Double> ad=new ArrayList<Double>();
   ad.add(12.12);
   ad.add(21.21);
   ad.add(null);
   System.out.println(aby);
   
   
   ArrayList<int[]> ali=new ArrayList<int[]>();
   int a[]= {1,2,32,4,5};
   ali.add(a);
   int b[]= {6,72222,8,9,10};
   ali.add(b);
   for(int i=0;i<ali.size();i++) {
   System.out.println(Arrays.toString(ali.get(i)));
   }
   
   for(int i=0;i<ali.size();i++) {
	   int[] arr=ali.get(i);
	   for(int j=0;j<arr.length;j++) {
		   System.out.print(arr[j]+"	");
	   }
	   System.out.println();
	   
   }
   
   
}
	
}
