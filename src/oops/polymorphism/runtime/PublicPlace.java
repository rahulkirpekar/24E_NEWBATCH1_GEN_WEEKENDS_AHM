package oops.polymorphism.runtime;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace---getBehave()---Citizen Behaviour");
	}
	public void getPublicEvent() 
	{
		System.out.println("PublicPlace---Citizen---getPublicEvent()---");
	}
}
