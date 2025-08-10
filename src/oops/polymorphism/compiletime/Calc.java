package oops.polymorphism.compiletime;

// CompileTime -- Polymorphism
public class Calc 
{
	public static void addFun(long no1,long no2) 
	{
		System.out.println("Two(long) args : "+(no1+no2));
	}
	public static void addFun(double no1,double no2) 
	{
		System.out.println("Two(double) args : "+(no1+no2));
	}
	public static void addFun(int no1,int no2,int no3) 
	{
		System.out.println("Three(int) args : "+(no1+no2+no3));
	}
	public static void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("Four(int) args : "+(no1+no2+no3+no4));
	}
	
	public static void main(String[] args) 
	{
		addFun(20.f,10.88f);
		
	}
}
/*
   1. argument count
   2. exact argument type
   3. type pramotion rule
   
   
   Type Pramotion Rule:-
   ----------------------

	boolean-----------X
	
						byte
						 |	
						short
						 |	
char-------------------->int
						 |	
						long	
						 |	
   						float
						 |	
   						double
   					
     
 */