package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CashReceiptWindow extends ReceiptWindow {
	String amtPaid = "";
	
	public CashReceiptWindow(HashMap<Product, Integer> custoMap, String amtPaid) {
		super(custoMap);
		this.amtPaid = amtPaid;
		addCashString();
	}
	
	public void addCashString() {
		JPanel cashPanel = new JPanel();
		JLabel cashLabel = new JLabel("Amount tendered: " + amtPaid);
		cashPanel.add(cashLabel);
		double total = total(getSubTotal());
		double change = total - Double.parseDouble(amtPaid);
		JLabel changeLabel = new JLabel("Change due: " + Double.toString(change));
		cashPanel.add(changeLabel);
		bigPanel.add(cashPanel);
	}
}
