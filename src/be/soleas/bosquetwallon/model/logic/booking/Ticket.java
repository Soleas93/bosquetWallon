package be.soleas.bosquetwallon.model.logic.booking;

import java.time.format.DateTimeFormatter;

import be.soleas.bosquetwallon.model.logic.invoicing.IProduct;
import be.soleas.bosquetwallon.model.logic.show.Category;
import be.soleas.bosquetwallon.model.logic.show.Performance;

/**
 * 
 */
public class Ticket implements IProduct {
	/**
	 * 
	 */
	private int seat;

	/**
	 * 
	 */
	private Performance performance;
	
	private Category category;
	
	/**
	 * Default constructor
	 */
	public Ticket(Performance performance, Category category) {
		SetPerformance(performance);
		SetCategory(category);
	}
	
	public Ticket(Performance performance, Category category, int seat) {
		this(performance, category);
		SetSeat(seat);
	}

	public int GetSeat() {
		return seat;
	}

	private void SetSeat(int seat) {
		this.seat = seat;
	}

	public Performance GetPerformance() {
		return performance;
	}

	private void SetPerformance(Performance performance) {
		this.performance = performance;
	}

	public Category GetCategory() {
		return category;
	}

	private void SetCategory(Category category) {
		this.category = category;
	}

	@Override
	public double GetPrice() {
		return category.GetPrice();
	}

	@Override
	public int GetQuantity() {
		return 1;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
		return "Place " + category.GetTitle()+" pour " + performance.GetShow().GetTitle() + " le " + performance.GetOpenDoor().format(date)+ " à " + performance.GetOpenDoor().format(time);
	}


}