package Stud;

import java.io.*;
import java.sql.*;

public class StudMain {

	public void studmain() throws IOException,SQLException{
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		while(true){
			System.out.println("1. ���� �˻�");
			System.out.println("2. �ڽ��� �뿩 ���� ���� ���");
			System.out.println("3. �α׾ƿ�");
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
					System.out.println("�ٽ� �Է��ϼ���.");
					StudMain sm=new StudMain();
					sm.studmain();
<<<<<<< HEAD
					}
=======
				}
>>>>>>> origin/Student
			}
			
		
		}	
	}
}
