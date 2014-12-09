package Stud;

import java.io.*;
import java.sql.*;

public class StudMain {

	public void studmain() throws IOException,SQLException{
		
		String renting_stud;
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/library";
		String userID = "root";
		String userPass="1111";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, userID, userPass);
		String sql="select * from book where bname=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(true){
			System.out.println("1. 도서 검색");
			System.out.println("2. 자신이 대여 중인 도서 목록");
			System.out.println("3. 로그아웃");
			System.out.print("> ");
		
			int button = Integer.parseInt(br.readLine());
			
			InputStreamReader logsr = new InputStreamReader(System.in);
			BufferedReader logbr = new BufferedReader(logsr);
			
			String log="N";
			
			switch(button)
			{
				case 1:
				{
					StudSrch ss = new StudSrch();
					ss.studsrch();
					break;
				}
				case 2:
				{
					StudBrbk sb = new StudBrbk();
					sb.studbrbk();
					break;
				}
				case 3:
				{
					System.out.println("로그아웃을 하시겠습니까? Y or N");
					log = logbr.readLine();
					if(log=="Y")
						//rent_stud="";
						System.out.println("로그아웃이 완료되었습니다.");
					else{
						System.out.println("로그아웃을 취소하셔서 메인 화면으로 돌아왔습니다.");
						StudMain sm=new StudMain();
						sm.studmain();
					}
					break;
				}
				default:{
					System.out.println("다시 입력하세요.");
					StudMain sm=new StudMain();
					sm.studmain();
<<<<<<< HEAD
					}
=======
				}
>>>>>>> origin/Student
			}
			
		
		}	
	}
}
