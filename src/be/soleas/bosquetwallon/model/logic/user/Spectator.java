package be.soleas.bosquetwallon.model.logic.user;

import java.time.LocalDate;
import java.util.*;

import be.soleas.bosquetwallon.model.logic.booking.Booking;

/**
 * 
 */
public class Spectator extends Client {
	
	/**
	 * 
	 */
	private LocalDate dateOfBirth;

	public Spectator(Person person, String username, String password, String email, List<Booking> bookings, LocalDate dateOfBirth,
			boolean fromDb) {
		super(person, username, password, email, bookings, fromDb);
		
		SetDateOfBirth(dateOfBirth);
	}


	public Spectator(Person person, String username, String password, String email, LocalDate dateOfBirth, boolean fromDb) {
		this(person, username, password, email, null, dateOfBirth, fromDb);
	}

	public Spectator(Person person, String username, String password, String email, LocalDate dateOfBirth) {
		this(person, username, password, email, dateOfBirth, false);
	}


	public LocalDate GetDateOfBirth() {
		return dateOfBirth;
	}


	private void SetDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}