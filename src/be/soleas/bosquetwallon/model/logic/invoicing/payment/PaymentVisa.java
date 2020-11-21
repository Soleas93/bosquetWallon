package be.soleas.bosquetwallon.model.logic.invoicing.payment;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class PaymentVisa implements IPaymentMode {

	/**
	 * Default constructor
	 */
	public PaymentVisa() {
	}

	/**
	 * 
	 */
	private String cardNumber;

	/**
	 * 
	 */
	private int cvc;

	/**
	 * 
	 */
	private LocalDate expires;

	/**
	 * @param amount 
	 * @return
	 */
	public PayState Pay(double amount) {
		return null;
		
	}

}