package be.soleas.bosquetwallon.model.logic.invoicing.payment;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class PaymentSepa implements IPaymentMode {

	/**
	 * Default constructor
	 */
	public PaymentSepa() {
	}

	/**
	 * 
	 */
	private String iban;

	/**
	 * 
	 */
	private String bic;

	/**
	 * 
	 */
	private String communication;

	/**
	 * 
	 */
	private LocalDate creationDate;

	/**
	 * @param amount 
	 * @return
	 */
	public PayState Pay(double amount) {
		return null;
		
	}

}