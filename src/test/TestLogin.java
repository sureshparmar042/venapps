package test;

import java.io.Console;
import java.util.Scanner;

class Login
{
	String username;
	String password=null;

}
public class TestLogin {

	public static void main(String[] args) {
		
		Console c=System.console();
		Scanner sc=new Scanner(System.in);
		Login l=new Login();
		System.out.println("\n enter the user name:");
	    l.username=sc.nextLine();
		System.out.println("\n enter the password:");
		l.password=new String(c.readPassword());
		
		if(l.username.equals("Admin") && l.password.equals("System"))
		{
			 System.out.println("successfully login");
			 
		}
		else
		{
			 System.out.println("invalid username and password...");
		}
		
	}
}
