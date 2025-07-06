package oops.constructortopic.thistopic;

// this()---as Constructor
public class A 
{
	int no1,no2;
	A()
	{
		System.out.println("A :: A()-Default Constructor");
	}
	A(int no1)
	{
		this();
		System.out.println("A :: A(int no1) Constructor");
		this.no1=no1;
	}
	A(int no1,int no2)
	{
		this(no1);
		System.out.println("A :: A(int no1,int no2) Constructor");
		this.no2=no2;
	}
	public void disp() 
	{
		System.out.println("No1 : " + no1+" No2 : " + no2);
	}
	public static void main(String[] args) 
	{
		A obj3 = new A(100,200);
		
		obj3.disp();
	}
}