package test1;
import java.io.*;

public class AdminMain {
	
	public void adminmain() throws IOException{
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		while(true){
		System.out.println("1. 새로운 도서 정보 추가");
		System.out.println("2. 도시 검색");
		System.out.println("3. 모든 도서 보기");
		System.out.println("4. 로그아웃");
		System.out.print("> ");
		
		int n = Integer.parseInt(br.readLine());
		
		if(n==1){
			AdminAdd aa = new AdminAdd();
			aa.adminadd();
		}
		else if(n==2){
			AdminSearch as = new AdminSearch();
			as.adminsearch();
		}
		else if(n==3){
			AdminAll al = new AdminAll();
			al.adminall();
		}
		else if(n==4){
			//logout
			break;
		}
		else
			System.out.println("다시 입력하세요.");
		}
	}
	

	


}
