package co.grandcircus;

import java.util.ArrayList;

    public class CheckReceipt extends Receipt {
	int checkNumber;

	public CheckReceipt(ArrayList<Product> receipt) {
		super(receipt);
		
	}

	public CheckReceipt(ArrayList<Product> receipt, int checkNumber) {
		super(receipt);
		this.checkNumber = checkNumber;
	}

	public int getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}

	@Override
	public void printReceipt() {
		super.printReceipt();
		System.out.println(checkNumber);

	}

}
