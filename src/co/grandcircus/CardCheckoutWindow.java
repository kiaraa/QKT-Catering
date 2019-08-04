package co.grandcircus;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CardCheckoutWindow {
	
	
	
	JFrame frame = new JFrame("Checkout");
	JPanel panel = new JPanel(new SpringLayout());
	JLabel cardNum = new JLabel("Card Number: ");
	JLabel cardExpire = new JLabel("Card Expiration Date: ");
	JLabel cardCVV = new JLabel("Enter card CVV: ");
	JTextField cardNum1 = new JTextField();
	
	JTextField cardExpire1 = new JTextField();
	JTextField cardCVV1 = new JTextField();
	private HashMap<Product, Integer> custoMap;
	
	

public CardCheckoutWindow(HashMap<Product, Integer> custoMap) {	
	//SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
	this.custoMap = custoMap;
	
	
	
	panel.add(cardNum);
	panel.add(cardNum1);
	panel.add(cardExpire);
	panel.add(cardExpire1);
	panel.add(cardCVV);
	panel.add(cardCVV1);
	
	SpringUtilities.makeCompactGrid(panel,
            3, 2, //rows, cols
            6, 6,        //initX, initY
            6, 6);       //xPad, yPad
	
	frame.add(panel);
	frame.setPreferredSize(new Dimension(300,125));
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}
