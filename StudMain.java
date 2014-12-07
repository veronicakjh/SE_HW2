package Stud;

import java.io.*;
import java.sql.*;

public class StudMain {

	public void studmain() throws IOException,SQLException{
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		while(true){
			System.out.println("1. 도서 검색");
			System.out.println("2. 자신이 대여 중인 도서 목록");
			System.out.println("3. 로그아웃");
			System.out.print("> ");
		
			int button = Integer.parseInt(br.readLine());
		
			switch(button)
			{
				case 1:
				{
					StudSrch ss = new StudSrch();
					ss.studsrch();
					break;
				}
				case 2:
				{
					StudBrbk sb = new StudBrbk();
					sb.studbrbk();
					break;
				}
				case 3:
				{
					//logout
					break;
				}
				default:{
					System.out.println("다시 입력하세요.");
					StudMain sm=new StudMain();
					sm.studmain();
					}
			}
			
		
		}	
	}
}
