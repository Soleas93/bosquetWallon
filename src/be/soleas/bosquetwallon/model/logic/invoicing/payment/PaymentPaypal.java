package be.soleas.bosquetwallon.model.logic.invoicing.payment;


/**
 * 
 */
public class PaymentPaypal implements IPaymentMode {

	/**
	 * Default constructor
	 */
	public PaymentPaypal() {
	}

	/**
	 * 
	 */
	public String email;

	/**
	 * @param amount 
	 * @return
	 */
	public PayState Pay(double amount) {
		//Do some stuff about Paypal
		return email == null ? PayState.Not : PayState.Paid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}