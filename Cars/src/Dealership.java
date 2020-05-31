
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Dealership extends JFrame {
 
 private JLabel head;	
 public Dealership()
 {
	 setTitle("Car DealerShip");
		setSize(700, 700);
		setLayout(new BorderLayout());
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		createContents();
		setVisible(true);
 }
 private void createContents() {
	head  = new JLabel("Welcome to the DealerShip");     //Header label
	head.setHorizontalAlignment(SwingConstants.CENTER);
	this.add(head,BorderLayout.NORTH);
	
	JPanel panel = new JPanel();               //Center Panel for search boxes
	add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	JPanel panelRight = new JPanel();  
	add(panelRight, BorderLayout.EAST);
	panelRight.add(new JButton("Login"));

	JButton colorS = new JButton("Search By Color");

	JButton modelS = new JButton("Search By Model");
	JLabel  msg = new JLabel("Searching by: ");
	//panel
	panel.add(colorS);
	panel.add(modelS);
	panel.add(msg);
	colorS.setBounds(50,20,200,50);
	modelS.setBounds(250,20,200,50);
	msg.setBounds(450,0,100,100);
 

	 
 }
}