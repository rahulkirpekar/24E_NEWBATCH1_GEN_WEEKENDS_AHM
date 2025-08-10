package oops.abstopic.interfacetopic.task1;

public class Home implements Person
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
