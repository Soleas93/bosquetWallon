package be.soleas.bosquetwallon.model.logic.booking;

import java.util.*;

/**
 * 
 */
public class BookingTicket extends Booking {
	
	List<Ticket> tickets = new ArrayList<Ticket>();
	Shipping shippingMode;

	/**
	 * Default constructor
	 */
	public BookingTicket() {
	}
	
	public BookingTicket(List<Ticket> tickets) {
		SetTickets(tickets);
	}
	
	public BookingTicket(List<Ticket> tickets, Shipping shippingMode) {
		this(tickets);
		SetShipping(shippingMode);
	}
	
	//Constructor with Invoice ?

	/**
	 * @return
	 */
	public void AddTicket(Ticket ticket) {
		tickets.add(ticket);
		super.GetInvoice().Add(ticket);
	}
	
	public void RemoveTicket(Ticket ticket) {
		if(!tickets.contains(ticket))
			return;
		tickets.remove(ticket);
		super.GetInvoice().Remove(ticket);
		if(tickets.isEmpty())
			RemoveShipping();
	}
	
	private void SetTickets(List<Ticket> tickets) {
		this.tickets = tickets;
		for(Ticket t : tickets)
			super.GetInvoice().Add(t);
	}
	
	public List<Ticket> GetTickets() {
		return tickets;
	}
	
	public void SetShipping(Shipping shippingMode) {
		RemoveShipping();
		this.shippingMode = shippingMode;
		super.GetInvoice().Add(shippingMode);
	}
	
	public Shipping GetShipping() {
		return shippingMode;
	}
	
	private void RemoveShipping() {
		if(shippingMode == null)
			return;
		super.GetInvoice().Remove(shippingMode);
		shippingMode = null;
	}

}