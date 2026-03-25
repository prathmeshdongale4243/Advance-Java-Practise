package SimpleArrayList1;
import java.util.*;
public class ClassInArrayListStudent {
	public static void main(String[] ar) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Ram"));
		al.add(new Student(2,"Shyam"));
		al.add(new Student(3,"Om"));
		
		for(int i=0;i<al.size();i++) {
			System.out.println("Roll="+al.get(i).getRoll());
			System.out.println("Name="+al.get(i).getName());
		System.out.println("=================================");
		}
	
	
	}

}
