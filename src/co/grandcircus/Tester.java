package co.grandcircus;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Inventory inv = new Inventory();
		ArrayList<Product> prodList = new ArrayList<>();
		prodList = inv.readFromFile();
		for (Product prod : prodList) {
			System.out.println(prod);
		}

	}

}
