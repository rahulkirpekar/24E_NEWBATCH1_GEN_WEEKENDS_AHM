package collectiontopic.sortintech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "rahul", 12);
		Student s2= new Student(2, "ankur", 11);
		Student s3= new Student(3, "sagar", 10);
		Student s4= new Student(4, "ramesh", 9);
		Student s5= new Student(5, "brijesh", 8);
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s= (Student) itr.next();
			s.dispData();
		}
		System.out.println("---------------------------------------");
		
		Collections.sort(list);
		
		System.out.println("---------------------------------------");
		
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s= (Student) itr.next();
			s.dispData();
		}
	}
}
