package be.soleas.bosquetwallon.model.logic.invoicing;

/**
 * 
 */
public class InvoiceDetail {

	private IProduct product;
	/**
	 * 
	 */
	private String title;

	/**
	 * 
	 */
	private double unitPrice;

	/**
	 * 
	 */
	private int quantity;

	/**
	 * 
	 */
	private double totalPrice;
	
	/**
	 * Default constructor
	 */
	public InvoiceDetail(IProduct product){
		this(product.toString(), product.GetQuantity(), product.GetPrice());
		SetProduct(product);
	}
	
	public InvoiceDetail(String title, int quantity, double unitPrice) {
		SetTitle(title);
		SetQuantity(quantity);
		SetUnitPrice(unitPrice);
	}
	
	

	public IProduct GetProduct() {
		return product;
	}

	private void SetProduct(IProduct product) {
		this.product = product;
	}

	public String GetTitle() {
		return title;
	}

	private void SetTitle(String title) {
		this.title = title;
	}

	public double GetUnitPrice() {
		return unitPrice;
	}

	private void SetUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int GetQuantity() {
		return quantity;
	}

	private void SetQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double GetTotalPrice() {
		SetTotalPrice();
		return totalPrice;
	}

	private void SetTotalPrice() {
		this.totalPrice = quantity * unitPrice;
	}


}