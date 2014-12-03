package test1;
import java.io.*;

public class AdminAll {
	public void adminall() throws IOException{
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		for(int i=1;i==10;i++){//여기서 i는 sql로 검색이된 숫자
			System.out.println(i+". 도서명 ");
			System.out.println("저자: ");
			System.out.println("출판사: ");
			System.out.println("ISBN: ");
			System.out.println("대출가능여부: ");
			System.out.println("대여자: ");
		}
	}
}
