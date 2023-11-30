package usermanagementsystem;

public class User {
	private int userId;
    private String username;
    private String city;
    private String state;
    public User()
    {
        
    }
    public User(int userId, String username, String city, String state) {
        super();
        this.userId = userId;
        this.username = username;
        this.city = city;
        this.state = state;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username + ", city=" + city + ", state=" + state + "]";
    }
}
