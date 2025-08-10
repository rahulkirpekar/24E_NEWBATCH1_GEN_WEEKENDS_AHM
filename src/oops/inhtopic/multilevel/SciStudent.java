package oops.inhtopic.multilevel;

// MultiLevel Inheritance
public class SciStudent extends Student
{
	String labTask;

	public SciStudent(int rno, String name, int std, int marks, String labTask) 
	{
		super(rno, name, std, marks);
		this.labTask = labTask;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks+" " + labTask);
	}

}
