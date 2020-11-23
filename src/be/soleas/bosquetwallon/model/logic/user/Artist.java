package be.soleas.bosquetwallon.model.logic.user;

/**
 * 
 */
public class Artist extends Person {
	
	/**
	 * 
	 */
	private String activity;

	public Artist(String firstname, String name, String address, String activity) {
		super(firstname, name, address);
		SetActivity(activity);
	}

	public String GetActivity() {
		return activity;
	}

	public void SetActivity(String activity) {
		this.activity = activity;
	}
	
	
}