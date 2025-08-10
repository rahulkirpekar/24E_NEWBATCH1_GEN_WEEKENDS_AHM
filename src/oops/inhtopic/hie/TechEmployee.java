package oops.inhtopic.hie;

public class TechEmployee extends Employee
{
	String projectName;

	public TechEmployee() 
	{
	}
	
	public TechEmployee(int id, String name, int salary, String projectName)
	{
		super(id, name, salary);
		this.projectName = projectName;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + projectName);
	}
}
