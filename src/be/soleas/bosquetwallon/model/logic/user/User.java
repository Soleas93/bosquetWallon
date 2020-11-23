package be.soleas.bosquetwallon.model.logic.user;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 */
public class User{
	
	private Person person;
	
	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private String passwordHash;

	/**
	 * 
	 */
	private String email;

	/**
	 * Default constructor
	 */
	public User(Person person, String username, String password, String email, boolean fromDb) {
		this.person = person;
		SetUsername(username);
		if(fromDb)
			passwordHash = password;
		else 
			SetPassword(password);
		SetEmail(email);
		
	}
	
	public User(Person person, String username, String password, String email) {
		this(person, username,password,email,false);
	}

	public Person GetPerson() {
		return person;
	}


	public String GetUsername() {
		return username;
	}

	private void SetUsername(String username) {
		this.username = username;
	}

	public String GetPasswordHash() {
		return passwordHash;
	}

	private void SetPassword(String password){
			this.passwordHash = HashPassword(password);
	}
	
	public boolean ChangePassword(String oldPassword, String newPassword) {
		if(!CheckPassword(oldPassword))
			return false;
		SetPassword(newPassword);
		return true;
	}

	public String GetEmail() {
		return email;
	}

	public void SetEmail(String email) {
		this.email = email;
	}
	
	public static String HashPassword(String password) {
		try{
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			return digest.digest(password.getBytes(StandardCharsets.UTF_8)).toString();
		}
		catch(NoSuchAlgorithmException e){
			System.out.print("Error with HashPassword from User class : " + e);
			return null;
		}
		
	}
	
	private boolean CheckPassword(String password) {
		if(HashPassword(password).equals(passwordHash))
			return true;
		return false;
	}
	

	

}