package collectiontopic.list;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
}
