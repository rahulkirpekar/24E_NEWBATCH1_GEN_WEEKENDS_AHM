package oops.statictopic;

public class TestApp1 
{
	static int count = 0 ;

	public TestApp1()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		TestApp1 app1= new TestApp1();//count = 5
		TestApp1 app2= new TestApp1();//count = 5
		TestApp1 app3= new TestApp1();//count = 5
		TestApp1 app4= new TestApp1();//count = 5
		TestApp1 app5= new TestApp1();//count = 5
	
		System.out.println("app1.count : " + app1.count);
		System.out.println("app2.count : " + app2.count);
		System.out.println("app3.count : " + app3.count);
		System.out.println("app4.count : " + app4.count);
		System.out.println("app5.count : " + app5.count);
	}
}
/*
	A. C.E
	B. Runtime Error
	C. Output--?
*/