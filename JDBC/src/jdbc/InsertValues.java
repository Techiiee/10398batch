package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/10398batch", "student", "student");
		PreparedStatement ps = con.prepareStatement("insert into admin values(?,?)");
		ps.setString(1, "gayathri");
		ps.setString(2, "gayu@123");
		ps.executeUpdate();
		con.close();
		System.out.println("inserted successfully");
	}
}
