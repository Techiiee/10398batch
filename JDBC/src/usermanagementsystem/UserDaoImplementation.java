package usermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplementation implements UserDao
{

    @Override
    public List<User> findAll() throws ClassNotFoundException, SQLException 
    {
        ArrayList<User> userlist=new ArrayList<User>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/10398batch","student","student");
        PreparedStatement ps=con.prepareStatement("select * from user");
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            User u=new User();
            u.setUserId(rs.getInt(1));
            u.setUsername(rs.getString(2));
            u.setCity(rs.getString(3));
            u.setState(rs.getString(4));
            userlist.add(u);
        }
        return userlist;
    }
    
    @Override
	public void insertNew(User u) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/10400batch","root","root");
		PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?)");
		ps.setInt(1, u.getUserId());
		ps.setString(2, u.getUsername());
		ps.setString(3, u.getCity());
		ps.setString(4, u.getState());
		ps.executeUpdate();
		con.close();
		System.out.println("insert successfully");	
	}
    
    @Override
	public void updateUser(User u) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/10400batch","root","root");
		PreparedStatement ps=con.prepareStatement("update user set username=?,city=?,state=? where userId=?");
		
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getCity());
		ps.setString(3, u.getState());
		ps.setInt(4, u.getUserId());
		ps.executeUpdate();
		con.close();
		System.out.println("update successfully");		
	}
    @Override
	public void viewUserById(User u) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/10400batch","root","root");
		PreparedStatement ps=con.prepareStatement("select * from user where userId=?");	
		ps.setInt(1, u.getUserId());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}
	}
    
    @Override
	public void deleteUserById(int  userId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/10400batch","root","root");
		PreparedStatement ps=con.prepareStatement("delete from user where userId=?");
		
		
		ps.setInt(1, userId);
		ps.executeUpdate();
		con.close();
		System.out.println("deleted successfully");		
		
	}
    @Override
	public void deleteAllUser() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/10400batch","root","root");
		PreparedStatement ps=con.prepareStatement("truncate table user");
		
		
		ps.executeUpdate();
		con.close();
		System.out.println("delete all successfully");		
		
	}
}
