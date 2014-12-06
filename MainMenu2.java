package library;
import java.io.*;


public class MainMenu2 {
	public void mainmenu2() throws IOException{ 
		
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		
		String id, pw;
		
		System.out.println("---------------------------");
		System.out.println("로그인");
		System.out.println("---------------------------");
		System.out.print("아이디:	");
		id=br.readLine();
		System.out.print("비밀번호:	");
		pw=br.readLine();
		
		//디비 연동하기.
		//아이디 비번 잘못 입력했을 경우, 잘못입력했다는 메시지 출력과 함께 다시 입력받기.
		
	}
}
