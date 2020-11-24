package be.soleas.bosquetwallon.model.logic.invoicing.payment;

import java.time.LocalDate;

/**
 * 
 */
public class PaymentVisa implements IPaymentMode {

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
	 * Default constructor
	 */
	public PaymentVisa() {
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public LocalDate getExpires() {
		return expires;
	}

	public void setExpires(LocalDate expires) {
		this.expires = expires;
	}

	/**
	 * @param amount 
	 * @return
	 */
	public PayState Pay(double amount) {
		// Do some visa stuff...
		if(cardNumber != null && cvc > 0 && expires != null && expires.isAfter(LocalDate.now()))
			return PayState.Paid;
		return PayState.Not;
		
	}

}