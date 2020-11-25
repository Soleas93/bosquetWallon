package be.soleas.bosquetwallon.model.logic.booking;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

import be.soleas.bosquetwallon.model.logic.invoicing.IProduct;
import be.soleas.bosquetwallon.model.logic.scheduling.TimeLength;
import be.soleas.bosquetwallon.model.logic.show.Show;

/**
 * 
 */
public class BookingTheater extends Booking implements IProduct {
	
	private List<Show> shows = new ArrayList<Show>();
	private TimeLength schedule;

	/**
	 * Default constructor
	 */
	public BookingTheater(TimeLength schedule) {
		SetSchedule(schedule);
		super.GetInvoice().Add(this);
	}
	
	public BookingTheater(TimeLength schedule, List<Show> shows) {
		this(schedule);
		SetShows(shows);
		
	}
	
	//Constructor with Invoice ?
	
	private void SetSchedule(TimeLength schedule) {
		this.schedule = schedule;
	}
	
	public TimeLength GetSchedule() {
		return schedule;
	}
	
	private void SetShows (List<Show> shows) {
		this.shows = shows;
	}
	
	public List<Show> GetShows(){
		return shows;
	}
	
	public void AddShow(Show show) {
		shows.add(show);
	}
	
	public void RemoveShow(Show show) {
		if(shows.contains(show))
			shows.remove(show);
	}
	
	public LocalDateTime GetBegin() {
		return schedule.GetBegin();
	}
	
	public LocalDateTime GetEnd() {
		return schedule.GetEnd();
	}

	/**
	 * 
	 */
	@Override
	public double GetPrice() {
		double total = 0;
		int numOfDays = (int) GetBegin().until(GetEnd(), ChronoUnit.DAYS);
		DayOfWeek baseDay = GetBegin().getDayOfWeek();
		for(int i = 0; i < numOfDays; i++) {
			DayOfWeek day = baseDay.plus(i);
			//4500 ven ou sam, 3000 autres
			switch(day) {
			case FRIDAY, SATURDAY :
				total += 4500;
			default :
				total += 3000;
			}
		}
		// 2j = -5%, 3j = -10%, 7j = -20%, 15 = -30%
		double discount = numOfDays >= 15 ? 0.3: numOfDays >= 7 ? 0.2 : numOfDays >= 3 ? 0.1 : numOfDays >= 2 ? 0.05 : 0;

		return total * (double)(1.0-discount);
		
	}
	@Override
	public int GetQuantity() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return "Location de salle du " + GetBegin().format(dateTime) +" au " + GetEnd().format(dateTime);
	}


}