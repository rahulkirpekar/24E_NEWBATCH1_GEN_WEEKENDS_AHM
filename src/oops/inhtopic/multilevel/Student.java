package oops.inhtopic.multilevel;

public class Student extends Person
{
	int rno,std,marks;
	
	public Student() 
	{
		rno=1;
		std=12;
		marks=100;
	}
	public Student(int rno, String name, int std, int marks) 
	{
		super(name);
		this.rno = rno;
		this.std = std;
		this.marks = marks;
	}
}
