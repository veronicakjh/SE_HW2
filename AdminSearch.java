package test1;

import java.io.*;
import java.sql.*;

public class AdminSearch {
	
	AdminSearch() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	public void adminsearch() throws IOException, SQLException{
		
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
		
		//while(true){
		System.out.println("---------------------------");
		System.out.println("도서검색");
		System.out.println("---------------------------");
		
		////////!!!!!!주의!!! 일부만 검색해도 나올 수 있도록하기!!
		System.out.println("찾고 싶은 도서 제목을 입력해주세요.");
		System.out.print("> ");
		bname=br.readLine();
		sql="select * from book where bname=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1,bname);
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
		
		//while(true){
		System.out.println("수정이나 삭제를 할 도서의 ISBN을 입력해주세요.(단,0을 입력할 시에 메인화면으로 이동)");
		System.out.print("> ");
		ISBN=Integer.parseInt(br.readLine());
		
		if(ISBN==0){
			AdminMainMenu amm=new AdminMainMenu();
			amm.adminmainmenu();
		}
		/////////////여기부터 다시 손봐야함!!!///////////
		else{
			System.out.println("---------------------------");
			System.out.println("를 선택하셨습니다.");
			System.out.println("1.수정");
			System.out.println("2.삭제");
			System.out.println("3.도서 검색으로 이동");
			System.out.print("> ");
		
			int k=0;
			int n = Integer.parseInt(br.readLine());
		
			if(n==1){
				sql="select * from book where ISBN=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(4,ISBN);
				rs=ps.executeQuery();
				
				if(rs.next()){
					System.out.println("도서명: ");
					bname=br.readLine();
					System.out.println("저자: ");
					author=br.readLine();
					System.out.println("출판사: ");
					publisher=br.readLine();
					
					sql="update book set bname=?, author=?, publisher=? where ISBN=?";
					ps=conn.prepareStatement(sql);
					ps.setString(1, bname);
					ps.setString(2, author);
					ps.setString(3, publisher);
					ps.setInt(4, ISBN);
					ps.setString(5, availability);
					ps.setString(6, renting_stud);
					ps.executeUpdate();
				}
				else{
					System.out.println(ISBN+"은 존재하지 않는 도서 입니다. 다시 입력하세요");
					AdminSearch as=new AdminSearch();
					as.adminsearch();
				}
			}
			else if(n==2){
				AdminSearch as = new AdminSearch();
				as.admindelete();
			}
			else if(n==3){
				AdminSearch as=new AdminSearch();
				as.adminsearch();
			}
			
			////////여기까지 손봐야함!!!!//////
			
			else{
				System.out.println("다시 입력하세요.");
				System.out.println("1.수정");
				System.out.println("2.삭제");
				System.out.println("3.도서 검색으로 이동");
				System.out.print("> ");
			}
		}
	}
		//}
	//}
	
	public void adminedit(){
		
		System.out.println("---------------------------");
		System.out.println("수정이 완료되었습니다.");
	}
	
	public void admindelete(){
		System.out.println("---------------------------");
		System.out.println("삭제되었습니다.");
	}

}
