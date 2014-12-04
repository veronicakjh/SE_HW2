package library;
import java.io.*;
import java.sql.*;


public class MainMenu1 {

	MainMenu1() throws IOException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			//System.exit(0);
		}
	}
	
	public void mainmenu1() throws IOException, SQLException{
		
		String sid, pw, name, major;	
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/library";
		String userID = "root";
		String userPass="1111";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, userID, userPass);
		PreparedStatement ps= null;
		String sql=null;
		ResultSet rs = null;
		
		int n=0;
		sql="select * from user where sid=?";
		ps=conn.prepareStatement(sql);
		
		System.out.println("---------------------------");
		System.out.println("회원가입");
		System.out.println("---------------------------");
		System.out.print("아이디(학번):	");
		sid=br.readLine();
		ps.setString(1,  sid);
		rs=ps.executeQuery();
		//아이디 중복 체크. 중복되었을 경우, 다시 입력받음.
		
		if(!rs.next()){
			System.out.print("비밀번호:	");
			pw=br.readLine();
			//예외사항처리
			//비밀번호는 숫자로만 이루어져야 하고, 아닐 경우, 숫자로만 입력하라는 메세지가 뜬 후, 다시 입력
			//비밀번호는 8자리 이하여야 하고, 아닐 경우, 8자리 이하로만 입력하라고 메시지가 뜬후, 다시 입력.
		
			System.out.print("이름:	");
			name=br.readLine();
			System.out.print("학과:	");
			major=br.readLine();
			
			sql="insert into user values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,  sid);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, major);
			n=ps.executeUpdate();
			if(n>0){
				System.out.println("회원가입이 완료되었습니다");
			}
			else{
				System.out.println("회원가입이 실패하였습니다.");
			}
		}
		else{
			System.out.println("동일한 아이디가 존재합니다.");
			mainmenu1();
		}
	}	
}
