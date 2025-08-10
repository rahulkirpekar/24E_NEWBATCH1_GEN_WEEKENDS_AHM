package oops.inhtopic.hie;

public class ManagementEmployee extends Employee
{
	String mgmtTask;
	public ManagementEmployee() 
	{
	}

	public ManagementEmployee(int id, String name, int salary, String mgmtTask) 
	{
		super(id, name, salary);
		this.mgmtTask=mgmtTask;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + mgmtTask);
	}
}
