package co.grandcircus;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CashCheckoutWindow {
	
	
	
	JFrame frame = new JFrame("Checkout");
	JPanel panel = new JPanel(new SpringLayout());
	JLabel cashLabel = new JLabel("Cash amount: ");
	JTextField cashField = new JTextField();

	private HashMap<Product, Integer> custoMap;
	
public CashCheckoutWindow(HashMap<Product, Integer> custoMap) {	
	//SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
	this.custoMap = custoMap;
	
	panel.add(cashLabel);
	panel.add(cashField);
	
	SpringUtilities.makeCompactGrid(panel,
            1, 2, //rows, cols
            6, 6,        //initX, initY
            6, 6);       //xPad, yPad
	
	frame.add(panel);
	frame.setPreferredSize(new Dimension(175,60));
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}