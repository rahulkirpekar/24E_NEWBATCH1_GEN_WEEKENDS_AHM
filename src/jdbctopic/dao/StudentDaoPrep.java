package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

// PreparedStatement --- optimize
public class StudentDaoPrep 
{
	public int insertStudent(StudentBean s) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);

				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---insertStudent()---Db not connected");
		}
		return rowsAffected;
	}
	
	public int updateStudent(StudentBean s , int id) 
	{
		String updateQuery = "UPDATE student SET name=? , std=? , marks=? WHERE id = ?";
		
		System.out.println("updateQuery : " + updateQuery);
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0 ;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
				
				pstmt.setInt(4, id);
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDaoPrep---updateStudent()---Db not connected");
		}
		return rowsAffected;
	}
	
	
	
	public int deleteStudent(int id) 
	{
		String deleteQuery = "DELETE FROM student WHERE id = ?";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
			
				pstmt.setInt(1, id);
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---deleteStudent()----Db not connected.");
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM student";
		Connection conn =	DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		ArrayList<StudentBean> list = new ArrayList<>();
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
				rs = pstmt.executeQuery();
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);

//					System.out.println(id+" " + name+" " + std+ " "+ marks);
					sbean = new StudentBean(id, name, std, marks);
					list.add(sbean);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---getAllRecords() ---Db not connected");
		}
		return list;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		StudentDaoPrep studentDao = new StudentDaoPrep();
		
		System.out.println("-----------------------------------------------");
		ArrayList<StudentBean> list = studentDao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean sbean = list.get(i);
			
			System.out.println(sbean.getId()+" " + sbean.getName()+" " + sbean.getStd()+" " + sbean.getMarks());
		}
		
/*		
//		------------DELETE Student---------------------
		System.out.println("Enter Student Id which you want to delete : ");
		int id = sc.nextInt();
		
		StudentDaoPrep studentDao = new StudentDaoPrep();
		
		int rowsAffected = studentDao.deleteStudent(id);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted  : " + rowsAffected);
		}

		System.out.println("Enter Student Id which you want to Update Student record : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks  : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep studentDao = new StudentDaoPrep();
		
		int rowsAffected = studentDao.updateStudent(sbean,id);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated  : " + rowsAffected);
		}
		
		
		--------------------INSERT STUDENT-------------------
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks  : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep studentDao = new StudentDaoPrep();
		
		int rowsAffected = studentDao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/	}
}