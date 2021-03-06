package main;

/**
 * 
 * @author Alan Thompson
 * 
 * Profile.java
 * 
 * A Profile object to be used for registering the main application's user name and email address.
 *
 */

public class Profile {
	
	/**
	 * Profile member variables
	 */
	private String name;
	private String email;
	private boolean registered;
	
	public Profile() {
		name = "unregistered";
		email = "unregistered";
		registered = false;
	}
	
	/**
	 * Getter methods for member variables
	 */
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean isRegistered() {
		return registered;
	}
	
	
	/**
	 * Setter methods for member variables
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public void setRegistered(boolean status) {
		registered = status;
	}
}
