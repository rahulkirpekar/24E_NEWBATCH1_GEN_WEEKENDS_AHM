package collectiontopic.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();

		list.add("rahul");
		list.add("ankur");
		list.add("sagar");
		list.add("kunal");
		list.add("ramesh");
		list.add("brijesh");
		
		Iterator<String> itr =list.iterator();
		
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
	}
}

/*
   Primitive				   Wrapper==>Generics
 * DataType				    Class
 *    |						  |
 *  boolean------------------Boolean
 *  byte---------------------Byte
 *  char---------------------Character
 *  short--------------------Short
 * 	int----------------------Integer
 *  long---------------------Long
 *  float--------------------Float
 *  double-------------------Double
 * ---------------------------------------
 * 
 *  Student s1= new Student(1,"rahul",12);
 * 
 * 	ArrayList<Student> list = new ArrayList<Student>;
 * 
 * 	list.add(s1);
 * 
 * */
 */