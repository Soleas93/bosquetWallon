package be.soleas.bosquetwallon.model.logic.user;

/**
 * 
 */
public abstract class Person {
	/**
	 * 
	 */
	private String firstName;

	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private String address;

	/**
	 * Default constructor
	 */
	public Person(String firstname, String name, String address ) {
		SetFirstName(firstName);
		SetName(name);
		SetAddress(address);
	}

	public String GetFirstName() {
		return firstName;
	}

	public void SetFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String GetName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public String GetAddress() {
		return address;
	}

	public void SetAddress(String address) {
		this.address = address;
	}

}