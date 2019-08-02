package co.grandcircus;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class OrderWindow {

	Inventory inv;
	ArrayList<Product> custoList;
	
	JFrame frame;
	GridLayout topLayout; 
	JSplitPane splitPane;
	
	public OrderWindow(Inventory inv, ArrayList<Product> custoList) {
		this.inv = inv;
		this.custoList = custoList;
		frame = new JFrame();
		
		JPanel panel = new JPanel(new SpringLayout());
		splitPane = new JSplitPane();

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
		//EVERYTHING ABOVE THIS LINE WORKS RIGHT NOW.
		
		JPanel bottomPanel = new JPanel();
		JLabel instructions = new JLabel("Please select payment method", JLabel.LEADING);
		bottomPanel.add(instructions);
		
		JRadioButton cashButton = new JRadioButton("Cash",true);
		JRadioButton cardButton = new JRadioButton("Card");
		JRadioButton checkButton = new JRadioButton("Check");
		
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(cashButton);
		bGroup.add(cardButton);
		bGroup.add(checkButton);
		
		JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1));
        radioPanel.add(cashButton);
        radioPanel.add(cardButton);
        radioPanel.add(checkButton);
        
        bottomPanel.add(radioPanel);

		//Lay out the panel.
		SpringUtilities.makeCompactGrid(p,
		                                numPairs, 5, //rows, cols
		                                6, 6,        //initX, initY
		                                6, 6);       //xPad, yPad
		
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setDividerLocation(500);
		bottomPanel.setSize(700, 100);
		panel.add(p);
		
		splitPane.setTopComponent(panel);
		splitPane.setBottomComponent(bottomPanel);
		
		//panel.add(p);
		frame.add(splitPane);
		frame.setPreferredSize(new Dimension(700, 800));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
