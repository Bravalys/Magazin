package Model;

public abstract class User {
	private String username;
	private String password;
	private int privilegiu;
	
	
	public User(String username, String password, int privilegiu) {
		this.username = username;
		this.password = password;
		this.privilegiu = privilegiu;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getPrivilegiu() {
		return privilegiu;
	}

	public void setPrivilegiu(int privilegiu) {
		this.privilegiu = privilegiu;
	}
}
