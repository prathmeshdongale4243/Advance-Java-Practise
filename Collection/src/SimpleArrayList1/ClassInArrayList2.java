package SimpleArrayList1;
import java.util.*;
public class ClassInArrayList2 {
	public static void main(String ar[]) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1,"Ram",10000000));
		al.add(0,new Employee(2,"Shyam",20000000));
		al.add(new Employee(3,"Hari",30000000));
		al.forEach(System.out::println);
		
		System.out.println(al);
		
		
		
	}

}
