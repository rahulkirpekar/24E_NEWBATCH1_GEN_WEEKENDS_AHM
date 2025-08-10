package oops.abstopic.interfacetopic;

public interface A 
{
	// 1. Dm's---[public static final]
	public static final int NO  = 10;// public static final
	
	// 2. Mf's--[public abstract]

	public abstract void test1();// public abstract
	
	
// 3. Non-Abstract Methods
	// 1. static methods
		
	static void test2() 
	{
		System.out.println("A---static----test2()");
	}
	// 2. default methods 
	default void test3() 
	{
		System.out.println("A---default---test3()");
		test4();
	}
		// 3. private methods
	private void test4() 
	{
		System.out.println("A---private---test4()");
	}
}
