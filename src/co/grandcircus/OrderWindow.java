package co.grandcircus;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class OrderWindow {

	Inventory inv;
	ArrayList<Product> custoList;
	
	JFrame frame;
	GridLayout topLayout; 
	
	public OrderWindow(Inventory inv, ArrayList<Product> custoList) {
		this.inv = inv;
		this.custoList = custoList;
		frame = new JFrame();
		
		JPanel panel = new JPanel(new SpringLayout());

		String[] nameLabels = new String[12];
		String[] descLabels = new String[12];
		for (int i = 0; i < custoList.size(); i++) {
			nameLabels[i] = custoList.get(i).getName();
			descLabels[i] = custoList.get(i).getDescription();
		}
		
		int numPairs = nameLabels.length;

		//Create and populate the panel.
		JPanel p = new JPanel(new SpringLayout());
		for (int i = 0; i < numPairs; i++) {
			//Make name labels and description labels
		    JLabel l = new JLabel(nameLabels[i] + ": ", JLabel.LEADING);
		    p.add(l);
		    JLabel descLabel = new JLabel(custoList.get(i).getDescription());
		    l.setLabelFor(descLabel);
		    p.add(descLabel);
		    
		    // add Quantity labels and textfields
		    JLabel qtLabel = new JLabel("Qt: ");
		    JTextField qtField = new JTextField("0  ");
		    qtLabel.setLabelFor(qtField);
		    p.add(qtLabel);
		    p.add(qtField);
		    
		    JButton addButton = new JButton("Add to Cart");
		    p.add(addButton);
		    
		}

		//Lay out the panel.
		SpringUtilities.makeCompactGrid(p,
		                                numPairs, 5, //rows, cols
		                                6, 6,        //initX, initY
		                                6, 6);       //xPad, yPad
		
		panel.add(p);
		frame.add(panel);
		frame.setPreferredSize(new Dimension(700, 500));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
