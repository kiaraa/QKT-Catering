package co.grandcircus;

public class CheckReceipt extends Product {
	int checkNumber;

	
	public CheckReceipt(String name, String category, String description, double price) {
		super(name, category, description, price);
		// TODO Auto-generated constructor stub
	}
	

	public CheckReceipt(String name, String category, String description, double price, int checkNumber) {
		super(name, category, description, price);
		this.checkNumber = checkNumber;
	}


	public int getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}

	@Override
	public String toString() {
		return "Check Transaction Pending:" + price;
	}
	
}
