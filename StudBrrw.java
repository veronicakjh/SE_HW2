package Stud;

import java.io.*;
import java.sql.*;

public class StudBrrw {

	StudBrrw() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//학생이 빌리려는 책이 3권이 넘어가면 빌릴 수 없다는 메세지가 뜨고 로그인 후 화면으로 되돌아가게 한다.
			//이미 대여 중인 책을 빌리려고 시도할 경우 지금 현재 대여 중이라는 메세지가 뜨고 도서 검색 화면으로 되돌아가게 한다.
	
	public void studbrrw() throws IOException, SQLException{
		
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
		
		System.out.println("대출하고 싶은 도서의 ISBN을 입력해주세요.(단,0을 입력할 시에 메인화면으로 이동");
		System.out.print("> ");

		ISBN=Integer.parseInt(br.readLine());
			
		if(ISBN==0){
			StudMain sm=new StudMain();
			sm.studmain();
		}
			
		else{
			System.out.println("---------------------------");
			System.out.println("를 선택하셨습니다.");
			System.out.println("1.대여");
			System.out.println("2.도서 검색으로 이동");
			System.out.print("> ");
//오늘11시			
			int button = Integer.parseInt(br.readLine());
			
			switch(button)
			{
			//학생이 빌리려는 책이 3권이 넘어가면 빌릴 수 없다는 메세지가 뜨고 로그인 후 화면으로 되돌아가게 한다.
			//이미 대여 중인 책을 빌리려고 시도할 경우 지금 현재 대여 중이라는 메세지가 뜨고 도서 검색 화면으로 되돌아가게 한다.
				case 1:
				{
					if(rs.getString(5)=="N"){
						System.out.println("이미 다른 학생이 대여 중입니다. 다시 선택하세요.");
						StudSrch ss = new StudSrch();
						ss.studsrch();
						break;
					}else if(){
						
					}
					else{	
						StudBrrw sb = new StudBrrw();
						sb.studbrrw();
						sb.studbr();
						break;
					}
				}
				case 2:
				{
					StudSrch ss = new StudSrch();
					ss.studsrch();
					break;
				}
				default:
					System.out.println("다시 입력하세요.");
			}
		}
	}
	public void studbr(){
		System.out.println("---------------------------");	
		System.out.println("성공적으로 도서 대여가 완료되었습니다.");
	}
}

