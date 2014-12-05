package Stud;

import java.io.*;

public class StudSrch {
	
	public void studsrch() throws IOException{
			
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
			
		while(true){
			System.out.println("---------------------------");
			System.out.println("도서 검색");
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
				System.out.println("대출하고 싶은 도서의 ISBN을 입력해주세요.(단,0을 입력할 시에 메인화면으로 이동");
				System.out.print("> ");
			
				System.out.println("---------------------------");
				System.out.println("를 선택하셨습니다.");
				System.out.println("1.대여");
				System.out.println("2.도서 검색으로 이동");
				System.out.print("> ");
			
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
	}
		
	public void studbrrw(){
		System.out.println("---------------------------");	
		System.out.println("성공적으로 도서 대여가 완료되었습니다.");
	}
}

