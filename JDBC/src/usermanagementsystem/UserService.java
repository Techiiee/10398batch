package usermanagementsystem;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserService {
	public void viewUser() throws ClassNotFoundException, SQLException {
		List<User> userlist = new UserDaoImplementation().findAll();

		for (User u : userlist) {
			System.out.println(u);
		}
	}
	
	public void insertUser() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the userid");
		int userid=sc.nextInt();
		System.out.println("enter the username");
		String username=sc.next();
		System.out.println("enter the city");
		String city=sc.next();
		System.out.println("enter the state");
		String state=sc.next();
		User u=new User();
		u.setUserId(userid);
		u.setUsername(username);
		u.setCity(city);
		u.setState(state);
		new UserDaoImplementation().insertNew(u);
	}
	
	public void updateUser() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the userid");
		int userid=sc.nextInt();
		System.out.println("enter the username");
		String username=sc.next();
		System.out.println("enter the city");
		String city=sc.next();
		System.out.println("enter the state");
		String state=sc.next();
		User u=new User();
		
		u.setUsername(username);
		u.setCity(city);
		u.setState(state);
		u.setUserId(userid);
		new UserDaoImplementation().updateUser(u);
	}
	
	public void viewUserById() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the userid");
		int userid=sc.nextInt();
		User u=new User();
		u.setUserId(userid);
		new UserDaoImplementation().viewUserById(u);
	}
	
	public void deleteUser() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the userid");
		int userid=sc.nextInt();
		
		
		
		     new UserDaoImplementation().deleteUserById(userid);
	}
	public void deleteAllUser() throws ClassNotFoundException, SQLException
	{
		new UserDaoImplementation().deleteAllUser();
	}
}
