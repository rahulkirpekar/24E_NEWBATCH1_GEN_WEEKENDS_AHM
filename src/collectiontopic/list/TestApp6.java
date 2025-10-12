package collectiontopic.list;

import java.util.Vector;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		// ArrayList---data--store---display		
		// LinkedList---data--store---operation(insert,update,delete)		
		// Vector-----Concept Impl. MultiThreadding 
		
		Vector<String> list = new Vector<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("rakesh");//2
		list.add("brijesh");//3
		list.add("sagar");//4

		for (int i = 0; i < list.size(); i++) 
		{
			String name= list.get(i);
			System.out.println(name);
		}
	}
}