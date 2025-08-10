package oops.polymorphism.runtime;

public class Home extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Home---getBehave()---Child Behaviour");
	}

	public void getMovieOntime() 
	{
		System.out.println("Home--Child---getMovieOntime()");
	}
}
