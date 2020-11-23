package be.soleas.bosquetwallon.model.logic.user;


/**
 * 
 */
public class Manager extends User {

	/**
	 * 
	 */
	private String role;

	public Manager(Person person, String username, String password, String email, String role) {
		super(person, username, password, email);
		SetRole(role);
	}

	public String GetRole() {
		return role;
	}

	public void SetRole(String role) {
		this.role = role;
	}
	
	

	
}