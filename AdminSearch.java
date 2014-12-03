package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdminSearch {
	public void adminsearch() throws IOException{
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		while(true){
		System.out.println("---------------------------");
		System.out.println("도서검색");
		System.out.println("---------------------------");
		
		System.out.println("찾고 싶은 도서 제목을 입력해주세요.");
		System.out.print("> ");
		
		//sql
		for(int i=1;i==10;i++){//여기서 i는 sql로 검색이된 숫자
			System.out.println(i+". 도서명 ");
			System.out.println("저자: ");
			System.out.println("출판사: ");
			System.out.println("ISBN: ");
			System.out.println("대출가능여부: ");
			System.out.println("대여자: ");
		}
		
		while(true){
		System.out.println("수정이나 삭제를 할 도서의 ISBN을 입력해주세요.(단,0을 입력할 시에 메인화면으로 이동");
		System.out.print("> ");
		
		System.out.println("---------------------------");
		System.out.println("를 선택하셨습니다.");
		System.out.println("1.수정");
		System.out.println("2.삭제");
		System.out.println("3.도서 검색으로 이동");
		System.out.print("> ");
		
		
		int n = Integer.parseInt(br.readLine());
		
		if(n==1){
			AdminSearch aa = new AdminSearch();
			aa.adminedit();
		}
		else if(n==2){
			AdminSearch as = new AdminSearch();
			as.admindelete();
		}
		else if(n==3){
			break;
		}
		else
			System.out.println("다시 입력하세요.");
		}
		}
	}
	
	public void adminedit(){
		System.out.println("---------------------------");
		System.out.println("수정이 완료되었습니다.");
	}
	
	public void admindelete(){
		System.out.println("---------------------------");
		System.out.println("삭제되었습니다.");
	}

}
