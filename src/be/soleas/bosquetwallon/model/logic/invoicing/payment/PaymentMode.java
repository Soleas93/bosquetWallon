package be.soleas.bosquetwallon.model.logic.invoicing.payment;


/**
 * 
 */
public class PaymentMode {
	IPaymentMode strategy;

	/**
	 * Default constructor
	 */
	public PaymentMode() {
	}
	
	public PaymentMode(IPaymentMode strategy) {
		SetPaymentMode(strategy);
	}

	/**
	 * @param strategy
	 */
	public void SetPaymentMode(IPaymentMode strategy ) {
		this.strategy = strategy;
	}

	/**
	 * @param amount 
	 * @return
	 */
	public PayState Pay(double amount) {
		if(strategy != null)
			return strategy.Pay(amount);
		new Exception("Payment Mode strategy must be initialized to call Pay() method.").printStackTrace();
		return PayState.Not;
	}

}