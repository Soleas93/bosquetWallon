package be.soleas.bosquetwallon.model.logic.invoicing.payment;

import java.security.SecureRandom;
import java.time.LocalDate;

/**
 * 
 */
public class PaymentSepa implements IPaymentMode {

	/**
	 * Default constructor
	 */
	public static final SecureRandom random = new SecureRandom();

	/**
	 * 
	 */
	private static String iban = "BE00 1234 1234 1234";

	/**
	 * 
	 */
	private static String bic = "BANKBEBB";

	/**
	 * 
	 */
	private String communication;

	/**
	 * 
	 */
	private LocalDate paymentDate;
	
	public PaymentSepa() {
		SetCommunication();
	}
	public PaymentSepa(String communication) {
		this.communication = communication;
	}
	
	public PaymentSepa(String communication, LocalDate paymentDate) {
		this(communication);
		this.paymentDate = paymentDate;
	}
	
	private void SetCommunication() {
		if(this.communication != null)
			return;
		int randNumber=random.nextInt(999999999+1);
		int control = randNumber%97;
		
	    String output = String.format("%010d", randNumber);
	    
		communication =new String("+++"+output.substring(0, 3)+"/"+output.substring(3, 7)+"/"+output.substring(7)+control+"+++");
	}
	
	public String GetCommunication() {
		return communication;
	}
	
	

	public String GetIban() {
		return iban;
	}

	public String GetBic() {
		return bic;
	}
	
	private void SetPaymentDate() {
		if(paymentDate == null)
			paymentDate = LocalDate.now();
	}

	public LocalDate GetPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param amount 
	 * @return
	 */
	public PayState Pay(double amount) {
		SetPaymentDate();
		return PayState.Pending;
	}
	
	

}