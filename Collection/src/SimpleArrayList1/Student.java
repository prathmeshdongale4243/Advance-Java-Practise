package SimpleArrayList1;

public class Student {
	int Roll;
	String name;
	 Student(int Roll,String name){
		 this.Roll=Roll;
		 this.name=name;
		 
	 }
	 public int getRoll() {
		 return Roll;
	 }
	 public void setRoll(int roll) {
		 Roll = roll;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String toString() {
		 return "Student Roll="+Roll+" Name="+name;
		 
	 }

}
