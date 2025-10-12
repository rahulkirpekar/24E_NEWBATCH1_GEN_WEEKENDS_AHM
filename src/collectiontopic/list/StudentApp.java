package collectiontopic.list;

import java.util.ArrayList;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("rakeesh");//2
		list.add("brijesh");//3
		list.add("sagar");//4
		
		for (int i = 0; i < list.size(); i++) 
		{
			String name= list.get(i);
			System.out.println(name);
		}
		System.out.println("------------------------");
		
		list.remove(2);// index
		for (int i = 0; i < list.size(); i++) 
		{
			String name= list.get(i);
			System.out.println(name);
		}
		System.out.println("------------------------");
		
		list.remove("brijesh");// value Based
		for (int i = 0; i < list.size(); i++) 
		{
			String name= list.get(i);
			System.out.println(name);
		}
	}
}
