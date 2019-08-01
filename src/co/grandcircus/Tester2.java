package co.grandcircus;

import java.util.ArrayList;

import java.util.Scanner;



public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Thanks for choosing KQT Catering, Here we aim to please!");
		System.out.println("Choose from the menu below");
		System.out.println(" ");
		System.out.println(" ");
		
			
		
		ArrayList<Product> CustoList = new ArrayList<>();
		Object condition = "Y";
		do {
			Inventory inv = new Inventory();
			ArrayList<Product> prodList = new ArrayList<>();
			prodList = inv.readFromFile();
			int i = 1;
			for (Product prod : prodList) {
				System.out.print(i + ". ");
				System.out.println(prod);
				i++;
				}
			//scan.next();
			
			
			int prodItem = scan.nextInt();
			scan.nextLine(); //garbage line
			Product prodLocation = prodList.get(prodItem -1);
			CustoList.add(prodLocation);
		
			System.out.println("Would you like to continue shopping? Y/N");
			condition = scan.next();
		} while (condition.equals("Y"));
		
		System.out.println("What is your method of payment? \n1. Card \n2. Check \n3. Cash");
		String choice = scan.next();
		
		if (choice.equals("Card")) {
			System.out.println("Enter Card number!");
			int cNum = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter expiration date!");
			String cDate = scan.next();
			scan.nextLine();
			System.out.println("Enter your card CW!");
			int cCW = scan.nextInt();
			scan.nextLine();
			
			Receipt receipt = new CardReciept(CustoList, cNum,cDate, cCW);
			receipt.printReceipt();
		}
		else if (choice.equals("Check")) {
			System.out.println("Enter your check number!");
			scan.nextDouble();
			double chkNum = scan.nextDouble();
		}
		else if (choice.equals("Cash")) {
			System.out.println("How much money are you paying");
			scan.nextDouble();
			double cash = scan.nextDouble();
			
		}
		else {
			System.out.println("Response unrecognizable, Enter either Cash, Card or Check!!!");
		}
		
	}
	
	
	
}
