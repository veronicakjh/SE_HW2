package test1;
import java.io.*;
import java.sql.*;

public class AdminMain {
	
	//public void adminmain() throws IOException{
	//!!!!!!!!!!주의!!!!!!!!!1!!!!!!
	//지금 따로 프로그램 짜느라 main이 필요해서 main으로 했음!
	//다 합칠 경우에는 위처럼 adminmain()으로 갈것!!
	
	public static void main(String[] args) throws IOException, SQLException{
		System.out.println("---------------------------");
		System.out.println("admin님 환영합니다.");
		System.out.println("---------------------------");
		AdminMainMenu amm=new AdminMainMenu();
		amm.adminmainmenu();
	}
	
}