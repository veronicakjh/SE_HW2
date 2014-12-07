package Stud;

import java.io.*;
import java.sql.*;

public class StudBrbk {

	StudBrbk() throws IOException{
		try{
				Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//도서를 반납할 때 정말 반납할 것이냐고 묻는 질문에 대소문자 구분 없이 y나 n이 아닌 다른 문자가 입력이 되면 질문을 다시 보여주고 사용자에게 입력을 받는다.
	public void studbrbk() throws IOException,SQLException{
		
		String bname, author, publisher, availability, renting_stud;
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
		System.out.println("자신이 대여 중인 도서 목록");
		System.out.println("---------------------------");
		
		// 여기부터 오늘 11시
		int i=0; //여기서 i는 sql로 검색이된 숫자
		if(i<=2){ // 2개만 소유 가능
			while(rs.next()){
				i++;
				System.out.println(i+". 도서명: "+rs.getString(1));
				System.out.println("저자: "+rs.getString(2));
				System.out.println("출판사: "+rs.getString(3));
				System.out.println("ISBN: "+rs.getInt(4));
				System.out.println("대출가능여부: "+rs.getString(5));
				System.out.println("대여자: "+rs.getString(6));
			}
		}else{//여기다가 해야하나?
			System.out.println("3권 이상을 빌리실 수 없습니다.");
		}
	}
}
