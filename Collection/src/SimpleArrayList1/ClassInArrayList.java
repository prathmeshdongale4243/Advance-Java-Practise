package SimpleArrayList1;
import java.util.*;

public class ClassInArrayList {
	//System.out.println("Ram");
	public static void main(String[] ar) {
	ArrayList<User> users=new ArrayList<User>();
	User user1=new User(1,"Ram","123");
	User user2=new User(2,"Shyam","456");
	User user3=new User(3,"Hari","789");
	User user4=new User(4,"Om","123");
	User user5=new User(5,"Sai","456");
	users.add(user1);
	users.add(user2);
	users.add(user3);
	users.add(user4);
	users.add(user5);
	for(int i=0;i<users.size();i++) {
    System.out.println(users.get(i).getId());
    System.out.println(users.get(i).getName());
    System.out.println(users.get(i).getPassword());
    System.out.println(users.get(i));
    System.out.println("=======================++===================");
    
	
	}
	System.out.println("By using iterator():");
	Iterator<User> u=users.iterator();
	while(u.hasNext()) {
		System.out.println(u.next());
				System.out.println("================================");
	}
	
	System.out.println("By using listIterator():");

	ListIterator<User> ult=users.listIterator();
	
		System.out.println("Forward:");
		while(ult.hasNext()) {
		System.out.println(ult.next());
	}
		
		System.out.println("Backward:");
	while(ult.hasPrevious()) {
		System.out.println(ult.previous());
	}
	
	
	System.out.println("\nFor Each of java 8 features:way 1");
	users.forEach(a->System.out.println(a));
	
	System.out.println("\nFor Each of java 8 features:way 2");
	users.forEach(System.out::println);
	
	
	
	
	
	
	
	
    }
	
	
	
	
	
}
