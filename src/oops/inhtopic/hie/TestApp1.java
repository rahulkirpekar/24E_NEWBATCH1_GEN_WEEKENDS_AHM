package oops.inhtopic.hie;

public class TestApp1 
{
	public static void main(String[] args)  
	{
		TechEmployee techEmp = new TechEmployee(1, "Ankur", 1222, "Mobile App Dev");
		techEmp.dispData();

		ManagementEmployee mgmtEmp = new ManagementEmployee(1, "Ganesh", 12222, "Counselling");
		mgmtEmp.dispData();
		
	}
}
