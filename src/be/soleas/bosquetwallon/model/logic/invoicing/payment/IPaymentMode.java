package be.soleas.bosquetwallon.model.logic.invoicing.payment;


/**
 * 
 */
public interface IPaymentMode {


	/**
	 * @param amount 
	 * @return
	 */
	public abstract PayState Pay(double amount);

}