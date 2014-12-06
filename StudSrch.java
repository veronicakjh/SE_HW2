package Stud;

import java.io.*;
import java.sql.*;

public class StudSrch {
	
	StudSrch() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//도서 검색 할 때 입력하는 도서명이 2자 미만이거나 20자가 넘으면 다시 입력 받도록 한다.
	
	public void studsrch() throws IOException, SQLException{
		
		String bname, availability, renting_stud;
		int ISBN;
		availability="";
		renting_stud="";
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
			
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/library";
		String userID = "root";
		String userPass="1111";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, userID, userPass);
		PreparedStatement ps= null;
		String sql=null;
		ResultSet rs = null;
		
		System.out.println("---------------------------");
		System.out.println("도서 검색");
		System.out.println("---------------------------");
			
		System.out.println("찾고 싶은 도서 제목을 입력해주세요.");
		System.out.print("> ");
			
		bname=br.readLine();
		sql="select * from book where bname=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1,bname);
		rs=ps.executeQuery();
			
			
		int i=0;
		while(rs.next()){
				System.out.println(i+". 도서명 "+rs.getString(1));
				System.out.println("저자: "+rs.getString(2));
				System.out.println("출판사: "+rs.getString(3));
				System.out.println("ISBN: "+rs.getInt(4));
				System.out.println("대출가능여부: "+rs.getString(5));
				System.out.println("대여자: "+rs.getString(6));
		}
	}
}
