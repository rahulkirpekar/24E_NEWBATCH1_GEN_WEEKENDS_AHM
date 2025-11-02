package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

// Statement Interface---CRUD
public class StudentDao 
{
	private int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0;
		
		Statement stmt = null;
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";
		
		System.out.println("insertQuery : " + insertQuery);
		
		// 1. getDBConnection
		Connection conn = DBConnection.getConnection();
		
		// 2. validate connection object
		if (conn != null)
		{
			try 
			{
				// 3. create Statement object
				stmt = conn.createStatement();
				
				// 4. execute sql query by statment
				rowsAffected = stmt.executeUpdate(insertQuery);
				
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---insertStudent() Db not connected");
		}
		
		return rowsAffected;
	}
	private void updateStudent() 
	{

	}
	private void deleteStudent() 
	{

	}
	private void getAllRecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks  : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		
		StudentDao studentDao = new StudentDao();
		
		int rowsAffected = studentDao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
	}
}