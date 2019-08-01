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
			ArrayList<Product> CustoList = new ArrayList<>();
			Product prodLocation = prodList.get(prodItem -1);
			CustoList.add(prodLocation);
		
			System.out.println("Would you like to continue shopping? Y/N");
			condition = scan.next();
		} while (condition.equals("Y"));
		
		System.out.println("What is your method of payment? \n1. Card \n2. Check \n3. Cash");
		scan.next();
		
		if (scan.equals("Card")) {
			System.out.println("Enter Card number!");
			scan.nextDouble();
			double cNum = scan.nextDouble();
			System.out.println("Enter expiration date!");
			scan.nextDouble();
			double cDate = scan.nextDouble();
			System.out.println("Enter your card CW!");
			scan.nextInt();
			int cCW = scan.nextInt();
		}
		else if (scan.equals("Check")) {
			System.out.println("Enter your check number!");
			scan.nextDouble();
			double chkNum = scan.nextDouble();
		}
		else if (scan.equals("Cash")) {
			System.out.println("How much money are you paying");
			scan.nextDouble();
			double cash = scan.nextDouble();
			
		}
		else {
			System.out.println("Response unrecognizable, Enter either Cash, Card or Check!!!");
		}
		
	}
	
	
	
}
