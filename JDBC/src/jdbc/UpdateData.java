package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/10398batch", "student", "student");
		PreparedStatement ps = con.prepareStatement("update admin set username=?,password=? where username=?");

		ps.setString(1, "admin");
		ps.setString(2, "admin@123");
		ps.setString(3, "gayathri");
		ps.executeUpdate();
		con.close();
		System.out.println("updated successfully");
	}

}
