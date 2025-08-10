package oops.inhtopic.sinh.cons;

public class B extends A
{
	int no2;
	public B() 
	{
		super(100);
		System.out.println("Default Constructor : B()");
		no2=200;
	}
	
	public B(int no1,int no2) 
	{
		super(no1);
		System.out.println("B - START :: Para Constructor");
		this.no2=no2;
		System.out.println("B - EXIT :: Para Constructor");
	}
	
	public void dispData() 
	{
		System.out.println("No1 : "+no1+" , No2 : " + no2);
	}
	public static void main(String[] args) 
	{
		 B obj = new B();
		 
		 obj.dispData();
	}
}
