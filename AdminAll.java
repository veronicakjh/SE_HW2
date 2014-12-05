package test1;

import java.io.*;
import java.sql.*;

public class AdminAll {
	
	AdminAll() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public void adminall() throws IOException, SQLException{
		
		String bname, author, publisher, availability, renting_stud;
		int ISBN;
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/library";
		String userID = "root";
		String userPass="1111";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, userID, userPass);
		PreparedStatement ps= null;
		String sql=null;
		ResultSet rs = null;
		
		sql="select * from book";
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		
		int i=0; //여기서 i는 sql로 검색이된 숫자
		while(rs.next()){
			i++; 
			System.out.println(i+". 도서명: "+rs.getString(1));
			System.out.println("저자: "+rs.getString(2));
			System.out.println("출판사: "+rs.getString(3));
			System.out.println("ISBN: "+rs.getInt(4));
			System.out.println("대출가능여부: "+rs.getString(5));
			System.out.println("대여자: "+rs.getString(6));
		}
		AdminMainMenu amm=new AdminMainMenu();
		amm.adminmainmenu();
	}
}
