package Stud;

import java.io.*;
import java.sql.*;

public class StudBrbk {
	
	StudBrbk() throws IOException{
		try{
				Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
<<<<<<< HEAD
=======
	//������ �ݳ��� �� ���� �ݳ��� ���̳İ� ���� ������ ��ҹ��� ���� ���� y�� n�� �ƴ� �ٸ� ���ڰ� �Է��� �Ǹ� ������ �ٽ� �����ְ� ����ڿ��� �Է��� �޴´�.
>>>>>>> origin/Student
	public void studbrbk() throws IOException,SQLException{
		
		String bname, author, publisher, availability, renting_stud;
		int ISBN;
		availability="";
		renting_stud="";
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/library";
		String userID = "root";
		String userPass="1111";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, userID, userPass);
		PreparedStatement ps= null;
		String sql=null;
		ResultSet rs = null;
		 
		System.out.println("---------------------------");
		System.out.println("�ڽ��� �뿩 ���� ���� ���");
		System.out.println("---------------------------");
		
		// ������� ���� 11��
<<<<<<< HEAD
<<<<<<< HEAD
		
		
=======
		int i=0; //���⼭ i�� sql�� �˻��̵� ����
		if(i<=2){ // 2���� ���� ����
=======
		int count=0;//���⼭ i�� sql�� �˻��̵� ����
		if(count<=2){ // 2���� ���� ����
>>>>>>> origin/Student
			while(rs.next()){
				count++;
				System.out.println(count+". ������: "+rs.getString(1));
				System.out.println("����: "+rs.getString(2));
				System.out.println("���ǻ�: "+rs.getString(3));
				System.out.println("ISBN: "+rs.getInt(4));
				System.out.println("���Ⱑ�ɿ���: "+rs.getString(5));
				System.out.println("�뿩��: "+rs.getString(6));
			}
		}else{//����ٰ� �ؾ��ϳ�?
			System.out.println("3�� �̻��� ������ �� �����ϴ�.");
		}
>>>>>>> origin/Student
	}
	public void studbkcount(int c){
	;//	System.out.println("�� "+studbrbk().count+"���� �뿩�ϼ̽��ϴ�.");	
	}
}
