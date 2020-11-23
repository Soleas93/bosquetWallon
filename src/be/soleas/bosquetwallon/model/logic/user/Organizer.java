package be.soleas.bosquetwallon.model.logic.user;

import java.util.*;

import be.soleas.bosquetwallon.model.logic.booking.Booking;

/**
 * 
 */
public class Organizer extends Client {

	/**
	 * 
	 */
	private String proName;

	/**
	 * 
	 */
	private String vatNumber;
	
	public Organizer(Person person, String username, String password, String email, List<Booking> bookings, String proName, String vatNumber,
			boolean fromDb) {
		super(person, username, password, email, bookings, fromDb);
		
		SetProName(proName);
		SetVatNumber(vatNumber);
	}


	public Organizer(Person person, String username, String password, String email, String proName, String vatNumber, boolean fromDb) {
		this(person, username, password, email, null, proName, vatNumber, fromDb);
	}

	public Organizer(Person person, String username, String password, String email, String proName, String vatNumber) {
		this(person, username, password, email, proName, vatNumber, false);
	}

	public String GetProName() {
		return proName;
	}

	public void SetProName(String proName) {
		this.proName = proName;
	}

	public String GetVatNumber() {
		return vatNumber;
	}

	public void SetVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

}