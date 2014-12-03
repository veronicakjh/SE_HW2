package test1;

import java.io.*;

public class AdminAdd {

	public void adminadd() throws IOException{
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		while(true){
		System.out.println("---------------------------");
		System.out.println("도서추가");
		System.out.println("---------------------------");
		
		System.out.print("도서명: ");
		System.out.print("저자: ");
		System.out.print("출판사: ");
		System.out.print("ISBN: ");
		
		System.out.println("---------------------------");
		System.out.println("도서 입력이 완료되었습니다.");
		
		}
	}
}
