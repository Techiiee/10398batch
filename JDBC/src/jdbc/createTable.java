package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/10398batch","student","student");
		Statement st=con.createStatement();
		String query="create table admin(username varchar(78),password varchar(89))";
	    st.execute(query);
	    con.close();
	    System.out.println("created successfully");
	}

}