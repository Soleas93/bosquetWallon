package be.soleas.bosquetwallon.model.logic.user;

import java.util.*;

import be.soleas.bosquetwallon.model.logic.booking.Booking;

/**
 * 
 */
public abstract class Client extends User {
	
	private List<Booking> bookings = new ArrayList<Booking>();

	public Client(Person person, String username, String password, String email, boolean fromDb) {
		super(person, username, password, email, fromDb);
	}

	public Client(Person person, String username, String password, String email) {
		this(person, username, password, email, false);
	}
	
	public Client(Person person, String username, String password, String email,List<Booking> bookings, boolean fromDb ) {
		this(person, username, password, email, fromDb);
		if(bookings != null)
			this.bookings = bookings;
	}


	/**
	 * @param booking 
	 * @return
	 */
	public void AddBooking(Booking booking) {
		bookings.add(booking);
	}
	
	public void RemoveBooking(Booking booking) {
		if(bookings.contains(booking))
			bookings.remove(booking);
	}
}