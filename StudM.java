package Stud;

import java.io.*;
import java.sql.*;

public class StudM {
	public static void main(String[] args) throws IOException, SQLException{
		
		String renting_stud;
		
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/library";
		String userID = "root";
		String userPass="1111";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, userID, userPass);
		PreparedStatement ps= null;
		String sql=null;
		ResultSet rs = null;
		
		System.out.println("---------------------------");
		System.out.println(rs.getString(6) + " 님 환영합니다.");
		System.out.println("---------------------------");
		StudMain sm=new StudMain();
		sm.studmain();
	}
	
	
}
