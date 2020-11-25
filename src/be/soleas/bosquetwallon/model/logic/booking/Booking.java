package be.soleas.bosquetwallon.model.logic.booking;

import be.soleas.bosquetwallon.model.logic.invoicing.Invoice;

/**
 * 
 */
public abstract class Booking {

	/**
	 * Default constructor
	 */
	public Booking() {
	}
	
	public Booking(Invoice invoice) {
		SetInvoice(invoice);
	}

	/**
	 * 
	 */
	private Invoice invoice = new Invoice();

	public Invoice GetInvoice() {
		return invoice;
	}

	private void SetInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	


}