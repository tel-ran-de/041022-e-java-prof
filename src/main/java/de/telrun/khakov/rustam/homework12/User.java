package de.telrun.khakov.rustam.homework12;

/**
 * @author Rustam Khakov
 */
public class User {
	private String email;
	private byte[] password;

	public User() {
	}

	public User(String email, byte[] password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public byte[] getPassword() {
		return password;
	}
}
