package com.Returnype;

public class AppStudent {

		Student[] getStudents() {
			Student s1=new Student(1,"Ram");
			Student s2=new Student(2,"Sita");
			Student s3=new Student(3,"Om");
			Student s4=new Student(4,"Shyam");
		    
			
			Student students[]=new Student[4];
			students[0]=s1;
			students[1]=s2;
			students[2]=s3;
			students[3]=s4;
			
			return students;
		
		
		}
		
		Student getStudent() {
			Student s=new Student(1,"Ram");	
			return s;
			
		}
		public static void main(String[] ar) {
			
			AppStudent a=new AppStudent();
			Student[] students=a.getStudents();
			for(int i=0;i<students.length;i++) {
				
				System.out.println("Roll="+students[i].getRoll());
				System.out.println("Name="+students[i].getName());
				
				System.out.println("==============++===============");
			}
			Student s=a.getStudent();
			System.out.println("Return single student object Print it: ");
			System.out.println("Roll="+s.getRoll());
			System.out.println("Name="+s.getName());
			
			
			
			}

}
