package oops.classobject;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Student - Reference Variable Type(ClassName)
		// s - Reference Variable(Pointer variable store -- Object address) 
		// new--keyword--JVM runtime crreate object into HEAP 
		// Student - Object
		// Student()---Default Constructor
		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();

//		s1.scanData();
//		s2.scanData();
//		s3.scanData();
		
//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
		
		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}