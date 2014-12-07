package Stud;

import java.io.*;
import java.sql.*;

public class StudBrrw {

	StudBrrw() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//�л��� �������� å�� 3���� �Ѿ�� ���� �� ���ٴ� �޼����� �߰� �α��� �� ȭ������ �ǵ��ư��� �Ѵ�.
			//�̹� �뿩 ���� å�� �������� �õ��� ��� ���� ���� �뿩 ���̶�� �޼����� �߰� ���� �˻� ȭ������ �ǵ��ư��� �Ѵ�.
	
	public void studbrrw() throws IOException, SQLException{
		
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
			StudBrbk sbb = new StudBrbk();
			
			switch(button)
			{
			//�л��� �������� å�� 3���� �Ѿ�� ���� �� ���ٴ� �޼����� �߰� �α��� �� ȭ������ �ǵ��ư��� �Ѵ�.
			//�̹� �뿩 ���� å�� �������� �õ��� ��� ���� ���� �뿩 ���̶�� �޼����� �߰� ���� �˻� ȭ������ �ǵ��ư��� �Ѵ�.
				case 1:
				{
					if(rs.getString(5)=="N"){
						System.out.println("�̹� �ٸ� �л��� �뿩 ���Դϴ�. �ٸ� å�� �˻��ϼ���.");
						StudSrch ss = new StudSrch();
						ss.studsrch();
						break;
					}/*else if(sbb.studbrbk()>=3){//�ƾ����ؾ�����
						System.out.println("���� 2���� �̹� �������Դϴ�. 3�� �̻��� ���� �� �����ϴ�.");
					}*/
					else{	
						StudBrrw sb = new StudBrrw();
						sb.studbrrw();
						sb.studbr();
						break;
					}
				}
				case 2:
				{
					StudSrch ss = new StudSrch();
					ss.studsrch();
					break;
				}
				default:
					System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}
	public void studbr(){
		System.out.println("---------------------------");	
		System.out.println("���������� ���� �뿩�� �Ϸ�Ǿ����ϴ�.");
	}
}

