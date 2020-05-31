
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Dealership extends JFrame {
 
 private JLabel head;	
 private JLabel msg;
 private JButton colorS;
 private JButton modelS;
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

	msg = new JLabel("");
	 
	colorS = new JButton("Search By Color");
    colorS.addActionListener(new ButtonListener());
	modelS = new JButton("Search By Model");
	modelS.addActionListener(new ButtonListener());
	//panel
	panel.add(colorS);
	panel.add(modelS);
	panel.add(msg);
	colorS.setBounds(50,20,200,50);
	modelS.setBounds(250,20,200,50);
	msg.setBounds(450,0,100,100);
 

	 
 }
 
	private class ButtonListener implements ActionListener {
		
		
		public void actionPerformed(ActionEvent event) {
			
			JButton jb = (JButton) event.getSource();
			if(jb.equals(colorS))
			{	
				msg.setText("Searching By Color");
			}
			else if (jb.equals(modelS))
			{	
				msg.setText("Searching By Model");
			}
		}
		
		
	}
			
			
		
}