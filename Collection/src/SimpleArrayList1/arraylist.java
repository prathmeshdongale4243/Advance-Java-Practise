package SimpleArrayList1;
import java.util.*;

public class arraylist {
	public static void main(String ar[])
	{
	//List--ArrayList,LinkedList,Vector
		//List can store different type of data
		//int -no
		//<>-is called generic is used when we want to store particularr type of data
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Ram");// String-->String
		al.add(111);//int--Integear
		al.add(10);//int--Integear
		
        al.add(21.21f);//float-Float		
        System.out.println("type of 21.21 = " + ((Object)21.21).getClass().getSimpleName());
        System.out.println("type of 21.21f = " + ((Object)21.21f).getClass().getSimpleName());
        System.out.println("type of 21 = " + ((Object)21).getClass().getSimpleName());
		al.add(true);//boolean--Boolean
		al.add(21.21);//double--Double
		
		al.add(100000000000000L);//long--Long
		al.add('R');//char--Character
		al.add(127);//byte--Byte
		al.add(32000);//short--Short
		al.add(null);
		 System.out.println("type of 32000 = " + ((Object)32000).getClass().getSimpleName());
		System.out.println(al);
		
		
		System.out.println(al);
		
		
		
		
	}

	private static char[] type(double d) {
		// TODO Auto-generated method stub
		return null;
	}
}
