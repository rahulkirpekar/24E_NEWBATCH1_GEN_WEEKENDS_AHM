package collectiontopic.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(10);// int----0 <==itr
		list.add(20.59);// float----1
		list.add(104L);// long----2
		list.add('r');//char----3
		list.add("royal");// String----4
		list.add(54.54);// double----5
		list.add(true);// boolean----6
		
		Student s1= new Student(1, "Ganesh", 12);
		
		list.add(s1);//----7

		
		// Advanced for loop / Enhanced for..loop / for each loop
		
		for(	Object obj : list) 
		{
			if(obj instanceof Student) 
			{
				Student s = (Student)obj;
				s.dispData();
			}else 
			{
				System.out.println(obj);
			}
		}
		
	//  Simple for loop	
/*		for(int i = 0; i < list.size();i++) 
		{
				Object obj = list.get(i);
				
				if(obj instanceof Student) 
				{
					Student s = (Student)obj;
					s.dispData();
				}else 
				{
					System.out.println(obj);
				}
		}
		// Traditional through Iterate
		Iterator itr =	list.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if(obj instanceof Student) 
			{
				Student s = (Student)obj;
				s.dispData();
			}else 
			{
				System.out.println(obj);
			}
		}
 */	
	}
}



