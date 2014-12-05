package test1;
import java.io.*;
import java.sql.*;

public class AdminAdd {
	
	AdminAdd() throws IOException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public void adminadd() throws IOException, SQLException{
		
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
		
		int n=0;

		System.out.println("---------------------------");
		System.out.println("도서추가");
		System.out.println("---------------------------");
		
		//관리자가 새로운 도서를 추가할 때, 입력된 정보가 조건에 맞지 않으면 잘못 입력했다는 메세지 출력 후 다시 입력받게 한다.
		//ISBN중복처리!! 이걸 늦게 봤네 우쒸.. 미리 봤으면 바로 하는건뎁; 
		
		System.out.print("도서명: ");
		bname=br.readLine();
		System.out.print("저자: ");
		author=br.readLine();
		System.out.print("출판사: ");
		publisher=br.readLine();		
		System.out.print("ISBN: ");
		ISBN=Integer.parseInt(br.readLine());

		sql="insert into book values(?,?,?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setString(1, bname);
		ps.setString(2, author);
		ps.setString(3, publisher);
		ps.setInt(4, ISBN);
		ps.setString(5, availability);
		ps.setString(6, renting_stud);
		n=ps.executeUpdate();
		System.out.println("---------------------------");
		if(n>0){
			System.out.println("도서 입력이 완료되었습니다.");
			System.out.println("---------------------------");
		}
		else{
			System.out.println("도서 입력이 실패하였습니다.");
			System.out.println("---------------------------");
			AdminAdd aa=new AdminAdd();
			aa.adminadd();
		}	

		AdminMainMenu amm=new AdminMainMenu();
		amm.adminmainmenu();
	}
}
