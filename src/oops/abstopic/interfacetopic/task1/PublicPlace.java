package oops.abstopic.interfacetopic.task1;

public class PublicPlace implements Person
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
