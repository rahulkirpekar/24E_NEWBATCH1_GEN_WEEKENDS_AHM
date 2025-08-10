package oops.abstopic.interfacetopic;

public class B implements A
{
	@Override
	public void test1() 
	{
		System.out.println("B---test1()");
	}

	public static void main(String[] args) 
	{
		A obj = new B();
		obj.test1();
		
		A.test2();
		obj.test3();
		
	}
}
