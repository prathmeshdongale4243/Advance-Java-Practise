package SimpleArrayList1;
import java.util.*;
public class ClassInArrayListBook {
	public static void main(String[] ar) {
		ArrayList<Book> al=new ArrayList<>();
		al.add(new Book("Ramayan",1000.0f));
		al.add(new Book("Gita",1000f));
		al.add(new Book("Mauli",2000f));
		
		ListIterator<Book> alt=al.listIterator();
		while(alt.hasNext()) {
			System.out.println(alt.next());
			
		}
		
		System.out.println("Backward:");
		while(alt.hasPrevious()) {
			System.out.println(alt.previous());
		}
		
	}

}
