import java.awt.BorderLayout;
import java.awt.GridLayout;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{

	private JComboBox<String> comboBox = new JComboBox<String>();
	private JPanel mainPanel, panelOne, panelTwo, panelThree, panelFour, panelFive, bottomPanel ;
	private JTextField name, price, amount;
	private JButton addBtn = new JButton("Add");
	private JTextArea area = new JTextArea(5,30);
	private JScrollPane scroll = new JScrollPane(area); 
	private ArrayList<Product> products = new ArrayList<Product>();
	public static void main(String[] args) {
		GUI gui = new GUI();
	}
	/**
	 * Sets up the GUI
	 */
	public GUI () {
		//Creates main panel
		mainPanel = new JPanel(new GridLayout(9, 0));
		//Creates drop down to allow users to select item
		mainPanel.add(new JLabel());
		mainPanel.add(new JLabel());
		comboBox.addItem("High End");
		comboBox.addItem("Medium End");
		comboBox.addItem("Low End");
		
		//Creates TextField to add items
		name = new JTextField(10);
		price = new JTextField(10);
		amount = new JTextField(10);
		
		//Creates panel and add components on them
		panelOne = new JPanel(new GridLayout(0, 4));
		panelOne.add(new JLabel());
		panelOne.add(new JLabel("Product Type"));
		panelOne.add(comboBox);
		
		panelTwo = new JPanel(new GridLayout(0, 4));
		panelTwo.add(new JLabel());
		panelTwo.add(new JLabel("Product Name"));
		panelTwo.add(name);
		
		panelThree = new JPanel(new GridLayout(0, 4));
		panelThree.add(new JLabel());
		panelThree.add(new JLabel("Product Price"));
		panelThree.add(price);
		
		panelFour = new JPanel(new GridLayout(0, 4));
		panelFour.add(new JLabel());
		panelFour.add(new JLabel("Product Amount"));
		panelFour.add(amount);
		
		panelFive = new JPanel(new GridLayout(0, 3));
		panelFive.add(new JLabel());
		panelFive.add(addBtn);
		
		bottomPanel = new JPanel();
		bottomPanel.add(scroll);
		
		mainPanel.add(panelOne);
		mainPanel.add(panelTwo);
		mainPanel.add(panelThree);
		mainPanel.add(panelFour);
		mainPanel.add(new JLabel());
		mainPanel.add(panelFive);
		
		addBtn.addActionListener(this);
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		this.setSize(600, 400);
		this.setVisible(true);
	}
	/**
	 * Responds to event when a button 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String stockName = name.getText();
		Double priceD = Double.parseDouble(price.getText());
		int amountI = Integer.parseInt(amount.getText());
		Product product = null;
		if (comboBox.getSelectedItem().toString().equalsIgnoreCase("High End")) {
			 product = new HighEnd(stockName, priceD, amountI);
		}
		if (comboBox.getSelectedItem().toString().equalsIgnoreCase("Medium End")) {
			 product = new MidRange(stockName, priceD, amountI);
		}
		if (comboBox.getSelectedItem().toString().equalsIgnoreCase("Low End")) {
			 product = new LowEnd(stockName, priceD, amountI);
		}
		products.add(product);
		JOptionPane.showMessageDialog(this, "Product has been added");
		area.setText("");
		name.setText("");
		price.setText("");
		amount.setText("");
		for (Product productObj : products) {
			area.append(productObj + "\n");
		}
	}
	
}
