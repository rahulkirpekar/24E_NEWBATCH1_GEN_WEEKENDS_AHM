package oops.abstopic.aclass;

public class B extends A
{
	@Override
	public void test1() 
	{
		System.out.println("B---test1()");
	}
	public static void main(String[] args) 
	{
		// Polymorphisc object
		A obj = new  B();
		
		obj.test1();
		
		obj.test2();
	}
}
