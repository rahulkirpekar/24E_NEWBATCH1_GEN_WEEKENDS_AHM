package oops.constructortopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"Ankur",1200);

		System.out.println("----After object creation process----");
		e1.dispData();// e--[id name salary]
		
		// e1--ready---clone
		
		Employee e2 = new Employee(e1);
		e2.dispData();// e--[id name salary]
		
		// Destructor---
		
		// Deamon Thread--backend execute service
		// System.gc();
	}
}
