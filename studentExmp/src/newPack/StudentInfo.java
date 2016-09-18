package newPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentInfo 
{
	void addStudent() throws Exception
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/jdbctest","sa","");
			PreparedStatement pst=con.prepareStatement("insert into employee values (201,'rahul','mvm',23456789)");
			pst.executeUpdate();
			pst.close();
			con.close();
			System.out.println("data is added....");;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)throws Exception
	{
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.addStudent();

	}

}
