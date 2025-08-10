package oops.inhtopic.sinh.task1;

public class Student extends Person
{
	int rno,std;
	
	public Student() 
	{
		rno=1;
		std=12;
	}
	public Student(int rno,String name , int std) 
	{
		super(name);
		this.rno=rno;
		this.std=std;
	}
	
//	public void scanData() 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Rno : ");
//		rno = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name : ");
//		name = sc.nextLine();
//		System.out.println("Enter Std : ");
//		std = sc.nextInt();
//	}
	public  void dispData()
	{
		System.out.println(rno+" " + name+" " + std);
	}
	public static void main(String[] args) 
	{
		Student s = new Student(2,"Ankur",10);
		s.dispData();
	}
}
