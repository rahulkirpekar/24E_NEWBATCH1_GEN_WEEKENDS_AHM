package oops.constructortopic;

public class Employee 
{
	private int id,salary;
	private String name;
	// 1. Default
	public Employee() 
	{
		System.out.println("=====START : Default Constructor=====");
		dispData();
		id = 1;
		name="Ganesh";
		salary=12;
		dispData();
		System.out.println("=====EXIT : Default Constructor=====");
	}
	// 2. Para -- Two
	public Employee(int id,String name) 
	{
		System.out.println("=====START : Two-PARA Constructor=====");
		dispData();
		
		this.id = id;
		this.name = name;
		
		dispData();
		System.out.println("=====EXIT : Two-PARA Constructor=====");
	}

	// 2. Para -- Three
	public Employee(int id,String name,int salary) 
	{
		System.out.println("=====START : Three-PARA Constructor=====");
		dispData();
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		dispData();
		System.out.println("=====EXIT : Three-PARA Constructor=====");
	}
	
	// 2. Para -- COPY
	public Employee(Employee e) 
	{
		System.out.println("=====START : COPY Constructor=====");
		dispData();
		
		this.id = e.id;
		this.name = e.name;
		this.salary = e.salary;
		
		dispData();
		System.out.println("=====EXIT : COPY Constructor=====");
	}
	
	// 3. Copy
	public void dispData() 
	{
		//				    0 		null 		0
		System.out.println(id+" " + name+" " + salary);
	}
	
}
