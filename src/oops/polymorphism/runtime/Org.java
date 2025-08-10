package oops.polymorphism.runtime;

public class Org extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Org---getBehave()---Employee Behaviour");
	}
	public void getSalary() 
	{
		System.out.println("Org--Employee---getSalary()");
	}
}
