package oops.abstopic.aclass;

public abstract class A 
{
	// 1. Dm's
	int no1;	
	// 2. constructor
	public A() 
	{
		no1=10;
	}
	// 3. Mf's
		// 1. Abstract Methods
		public abstract void test1();
	
		// 2. Non-Abstract Methods
		public void test2() 
		{
			System.out.println("A---test2()");
		}
}
