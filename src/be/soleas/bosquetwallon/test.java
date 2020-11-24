package be.soleas.bosquetwallon;

import be.soleas.bosquetwallon.model.logic.invoicing.payment.PaymentSepa;

public class test {

	public static void main(String[] args) {
		PaymentSepa sepa = new PaymentSepa();
		
		System.out.println("communication : "+sepa.GetCommunication());

		// TODO Auto-generated method stub

	}

}
