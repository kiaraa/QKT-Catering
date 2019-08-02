package co.grandcircus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CheckOutHandler implements ActionListener {
 
	HashMap<Product, Integer> custoMap;
	
	
	

	public CheckOutHandler(HashMap<Product, Integer> custoMap) {
		this.custoMap = custoMap;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		new CardCheckoutWindow(custoMap);
	
		
		
	}

}
