package be.soleas.bosquetwallon.model.logic.invoicing;

import java.util.*;

import be.soleas.bosquetwallon.model.logic.invoicing.payment.IPaymentMode;
import be.soleas.bosquetwallon.model.logic.invoicing.payment.PayState;
import be.soleas.bosquetwallon.model.logic.invoicing.payment.PaymentMode;

/**
 * 
 */
public class Invoice {

	private List<InvoiceDetail> details = new ArrayList<InvoiceDetail>();
	/**
	 * 
	 */
	private double total = 0;

	/**
	 * 
	 */
	private PayState paid = PayState.Not;
	
	private PaymentMode paymentMode = new PaymentMode();

	/**
	 * Default constructor
	 */
	public Invoice() {
	}
	
	public Invoice(List<InvoiceDetail> details) {
		SetDetails(details);
	}
	
	public Invoice(List<InvoiceDetail> details, PayState paid, PaymentMode payMode) {
		SetDetails(details);
		SetPaid(paid);
		SetPaymentMode(payMode);
	}
	
	private void SetDetails(List<InvoiceDetail> details) {
		this.details = details;
	}
	
	private void SetPaid(PayState paid) {
		this.paid = paid;
	}
	
	private void SetPaymentMode(PaymentMode payMode) {
		this.paymentMode = payMode;
	}
	
	private void SetTotal() {
		total = 0;
		for(InvoiceDetail detail : details)
			total += detail.GetTotalPrice();
	}
	
	public List<InvoiceDetail> GetDetails() {
		return details;
	}
	
	

	public double GetTotal() {
		SetTotal();
		return total;
	}

	public PayState GetPaid() {
		return paid;
	}

	public PaymentMode GetPayMode() {
		return paymentMode;
	}

	/**
	 * @param detail 
	 * @return
	 */
	public void Add(InvoiceDetail detail) {
		details.add(detail);
	}
	
	public void Add(IProduct product) {
		Add(new InvoiceDetail(product));
	}

	/**
	 * @param detail 
	 * @return
	 */
	public void Remove(InvoiceDetail detail) {
		if(details.contains(detail))
			details.remove(detail);
	}
	
	public void Remove(IProduct product) {
		InvoiceDetail detail = details.stream().filter(d -> d.GetProduct() == product).findFirst().orElse(null);
		if(detail != null)
			Remove(detail);
	}
	
	/**
	 * @return
	 */
	public void Pay() {
		SetTotal();
		SetPaid(paymentMode.Pay(total));
	}
	
	public void SetIPaymentMode(IPaymentMode strategy ) {
		paymentMode.SetPaymentMode(strategy);
	}

}