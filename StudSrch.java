package Stud;

import java.io.*;
import java.sql.*;

public class StudSrch {
	
	StudSrch() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
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
					case 1:
					{
						StudSrch ss = new StudSrch();
						ss.studbrrw();
						break;
					}
					case 2:
					{
					
						break;
					}
					default:
						System.out.println("다시 입력하세요.");
				}
			}
	}
		
	public void studbrrw(){
		System.out.println("---------------------------");	
		System.out.println("성공적으로 도서 대여가 완료되었습니다.");
	}
}

