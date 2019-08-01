package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Inventory inv = new Inventory();
		ArrayList<Product> prodList = new ArrayList<>();
		prodList = inv.readFromFile();

		
		Receipt receipt = new CardReciept(prodList, 2343,"04/03/09", 344);
		receipt.printReceipt();


	}
}	