package exceptiontopic;

// User Defined Exception ===> Custom Exception
//-------------------------------------------------
// Checked Exception
//public class InvalidAgeException extends Exception

//UnChecked Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
