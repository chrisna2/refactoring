package code.refactoring.complex_4;

public class UserVO {
	
	private String userId;
	private String password;
	private String name;
	private String email;
	
	public UserVO(String userid, String password, String name, String email) {
		this.userId = userid;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
