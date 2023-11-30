package usermanagementsystem;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
	public List<User>findAll() throws ClassNotFoundException, SQLException;
	public void insertNew(User u) throws ClassNotFoundException, SQLException;
	public void updateUser(User u) throws ClassNotFoundException, SQLException;
	public void viewUserById(User u) throws ClassNotFoundException, SQLException;
	public void deleteUserById(int userId) throws ClassNotFoundException, SQLException;
	public void deleteAllUser() throws ClassNotFoundException, SQLException;
}