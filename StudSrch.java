package Stud;

import java.io.*;
import java.sql.*;

public class StudSrch {
	
	StudSrch() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
		}
		catch(ClassNotFoundException e){
=======
		}catch(ClassNotFoundException e){
>>>>>>> origin/Student
			e.printStackTrace();
		}
	}
	
<<<<<<< HEAD
=======
	//���� �˻� �� �� �Է��ϴ� �������� 2�� �̸��̰ų� 20�ڰ� ������ �ٽ� �Է� �޵��� �Ѵ�.
	
>>>>>>> origin/Student
	public void studsrch() throws IOException, SQLException{
		
		String bname, availability, renting_stud;
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
		System.out.println("���� �˻�");
		System.out.println("---------------------------");
<<<<<<< HEAD
			
		System.out.println("ã�� ���� ���� ������ �Է����ּ���.");
		System.out.print("> ");
			
		bname=br.readLine();
		sql="select * from book where bname=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1,bname);
		rs=ps.executeQuery();
			
			
		int i=0;
		while(rs.next()){
				System.out.println(i+". ������ "+rs.getString(1));
				System.out.println("����: "+rs.getString(2));
				System.out.println("���ǻ�: "+rs.getString(3));
				System.out.println("ISBN: "+rs.getInt(4));
				System.out.println("���Ⱑ�ɿ���: "+rs.getString(5));
				System.out.println("�뿩��: "+rs.getString(6));
			}
			
			System.out.println("�����ϰ� ���� ������ ISBN�� �Է����ּ���.(��,0�� �Է��� �ÿ� ����ȭ������ �̵�");
			System.out.print("> ");

			ISBN=Integer.parseInt(br.readLine());
			
			if(ISBN==0){
				StudMain sm=new StudMain();
				sm.studmain();
			}
			
			else{
				System.out.println("---------------------------");
				System.out.println("�� �����ϼ̽��ϴ�.");
				System.out.println("1.�뿩");
				System.out.println("2.���� �˻����� �̵�");
				System.out.print("> ");
//����11��			
				int button = Integer.parseInt(br.readLine());
=======
>>>>>>> origin/Student
			
		System.out.println("ã�� ���� ���� ������ �Է����ּ���.");
		System.out.print("> ");
		
		bname=br.readLine();
		
		if(bname.length()<2 && bname.length()>20)
			System.out.println("ã�� ���� ���� ������ �Է����ּ���.(��, 2�� �̻� 20�� ���� ���� �ۼ����ּ���.)");
		else{
			sql="select * from book where bname=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,bname);
			rs=ps.executeQuery();
						
			int i=0;
			while(rs.next()){
				System.out.println(i+". ������ "+rs.getString(1));
				System.out.println("����: "+rs.getString(2));
				System.out.println("���ǻ�: "+rs.getString(3));
				System.out.println("ISBN: "+rs.getInt(4));
				System.out.println("���Ⱑ�ɿ���: "+rs.getString(5));
				System.out.println("�뿩��: "+rs.getString(6));
			}
	}
}
