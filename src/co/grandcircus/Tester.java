package co.grandcircus;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Inventory inv = new Inventory();
		ArrayList<Product> prodList = new ArrayList<>();
		prodList = inv.readFromFile();
		//for (Product prod : prodList) {
		//	System.out.println(prod);
		//}
//		Receipt receipt = new Receipt(prodList);
//		receipt.printReceipt();
//
//		Receipt receipt = new CashReceipt(prodList, 2000);
//		receipt.printReceipt();
		
		Receipt receipt = new CardReciept(prodList, 2343,"04/03/09", 344);
		receipt.printReceipt();

	}

}
