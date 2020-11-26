package be.soleas.bosquetwallon.model.logic.show;


/**
 * 
 */
public class Category implements Cloneable {

	/**
	 * 
	 */
	private String title;

	/**
	 * 
	 */
	private double price = 0;

	/**
	 * 
	 */
	private int maxAvailabilities;

	/**
	 * 
	 */
	private int maxBooking = 0;
	
	/**
	 * Default constructor
	 */
	public Category(String title, int maxAvailabilities) {
		SetTitle(title);
		SetMaxAvailabilities(maxAvailabilities);
	}
	
	

	public String GetTitle() {
		return title;
	}



	public void SetTitle(String title) {
		this.title = title;
	}



	public double GetPrice() {
		return price;
	}



	public void SetPrice(double price) {
		this.price = price;
	}



	public int GetMaxAvailabilities() {
		return maxAvailabilities;
	}



	public void SetMaxAvailabilities(int maxAvailabilities) {
		this.maxAvailabilities = maxAvailabilities;
	}



	public int GetMaxBooking() {
		return maxBooking;
	}



	public void SetMaxBooking(int maxBooking) {
		this.maxBooking = maxBooking;
	}
	
	@Override 
	public Object clone() {
		Category c = null;
		try {
			c = (Category) super.clone();
		}catch(CloneNotSupportedException cose) {
			cose.printStackTrace(System.err);
		}
		c.title = new String(title);
		
		return c;
	}
	


}