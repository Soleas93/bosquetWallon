package be.soleas.bosquetwallon.model.logic.booking;

import be.soleas.bosquetwallon.model.logic.invoicing.IProduct;

/**
 * 
 */
public class Shipping implements IProduct{

	/**
	 * Default constructor
	 */
	public Shipping(String title, String description, double price) {
		SetTitle(title);
		SetDescription(description);
		SetPrice(price);
	}

	/**
	 * 
	 */
	private String title;

	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	private double price;
	
	

	public String GetTitle() {
		return title;
	}

	public void SetTitle(String title) {
		this.title = title;
	}

	public String GetDescription() {
		return description;
	}

	public void SetDescription(String description) {
		this.description = description;
	}

	private void SetPrice(double price) {
		this.price = price;
	}

	@Override
	public double GetPrice() {
		return price;
	}

	@Override
	public int GetQuantity() {
		return 1;
	}
	
	public String toString() {
		return title;
	}


}