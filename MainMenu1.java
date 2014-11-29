package library;
import java.io.*;


public class MainMenu1 {
	public void mainmenu1() throws IOException{
		
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		
		String id, pw, name, major;
		
		System.out.println("---------------------------");
		System.out.println("회원가입");
		System.out.println("---------------------------");
		System.out.print("아이디(학번):	");
		id=br.readLine();
		//아이디 중복 체크. 중복되었을 경우, 다시 입력받음.
		
		System.out.print("비밀번호:	");
		pw=br.readLine();
		//예외사항처리
		//비밀번호는 숫자로만 이루어져야 하고, 아닐 경우, 숫자로만 입력하라는 메세지가 뜬 후, 다시 입력
		//비밀번호는 8자리 이하여야 하고, 아닐 경우, 8자리 이하로만 입력하라고 메시지가 뜬후, 다시 입력.
		
		System.out.print("이름:	");
		name=br.readLine();
		//예외사항처리? -> 아직 아무것도 정해진건 없음.
		
		System.out.print("학과:	");
		major=br.readLine();
		//예외사항 처리? -> 아직 아무것도 정해진건 없음.
	}
}
