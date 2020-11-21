package be.soleas.bosquetwallon.model.logic.invoicing;

import java.util.*;

import be.soleas.bosquetwallon.model.logic.invoicing.payment.PayState;

/**
 * 
 */
public class Invoice {

	/**
	 * Default constructor
	 */
	public Invoice() {
	}

	/**
	 * 
	 */
	private double total;

	/**
	 * 
	 */
	private PayState paid;




	/**
	 * @param detail 
	 * @return
	 */
	public void Add(InvoiceDetail detail) {
		// TODO implement here
		
	}

	/**
	 * @param detail 
	 * @return
	 */
	public void Remove(InvoiceDetail detail) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void Pay() {
		// TODO implement here
	}

}