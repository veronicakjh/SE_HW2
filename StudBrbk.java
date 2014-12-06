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
	
	//학생이 빌리려는 책이 3권이 넘어가면 빌릴 수 없다는 메세지가 뜨고 로그인 후 화면으로 되돌아가게 한다.
	//이미 대여 중인 책을 빌리려고 시도할 경우 지금 현재 대여 중이라는 메세지가 뜨고 도서 검색 화면으로 되돌아가게 한다.
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
		
		
	}
}
