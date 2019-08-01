package co.grandcircus;

public class CashReceipt extends Product {
	
	double total;
	double change;
	
	
	public CashReceipt(String name, String category, String description, double price) {
		super(name, category, description, price);
		// TODO Auto-generated constructor stub
	}
	
	public CashReceipt(String name, String category, String description, double price, double total, double change) {
		super(name, category, description, price);
		this.total = total;
		this.change = change;
	}

	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	
	@Override
	public String toString() {
		return "Total: " + total + ", Change: " + change;
	}
	
}
