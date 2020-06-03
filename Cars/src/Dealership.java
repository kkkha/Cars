
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
public class Dealership extends JFrame {
 //tr
 private JLabel head;	
 private JLabel msg;
 private JButton colorS;
 private JButton modelS;
 private JTextField searchBox;
 private JButton viewCars;
 private JPanel displayInfo;
 private JLabel displayText;
 private JLabel displayResults;
 private CarArray array;
 private LinkedList<Car> results;
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
	head.setFont(new Font("Calibri", Font.BOLD, 24));
	this.add(head,BorderLayout.NORTH);
	
	JPanel panel = new JPanel();               //Center Panel for search boxes
	add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	JPanel panelRight = new JPanel();  
	add(panelRight, BorderLayout.EAST);
	panelRight.add(new JButton("Login"));
	
	
	results = new LinkedList<Car>();
	array = new CarArray();
	Car car1=new Car("Mercedes", 100, "Black", 20000, 2015);
	array.addCar(car1);
	
	msg = new JLabel("");
	 
	colorS = new JButton("Search By Color");    //Search Color Button
	colorS.setOpaque(true);
	colorS.setBorderPainted(false);
	colorS.setForeground(Color.BLUE);
	colorS.setBackground(Color.RED);
    colorS.addActionListener(new ButtonListener());
     
    
	modelS = new JButton("Search By Model");   //Search Model Button
	modelS.setOpaque(true);
	modelS.setBorderPainted(false);
	modelS.setForeground(Color.BLUE);
	modelS.setBackground(Color.RED);
	modelS.addActionListener(new ButtonListener());
	
	searchBox = new JTextField("Enter Info");     //User will enter info
	
	viewCars = new JButton("View Cars");        //Click after entering info
	viewCars.setOpaque(true);
	viewCars.setBorderPainted(false);
	viewCars.setForeground(Color.BLACK);
	viewCars.setBackground(Color.BLUE);
	viewCars.addActionListener(new viewCarsListener());
	
	displayInfo = new JPanel();          //panel to displayCars
	displayInfo.setOpaque(true);
	displayInfo.setForeground(Color.BLUE);
	displayInfo.setBackground(Color.WHITE);

	//displayInfoPanel just prints text for now 
	displayText = new JLabel("");
	displayInfo.add(displayText);
	
	
	//display results
	displayResults = new JLabel("H");
	displayResults.setOpaque(true);
	displayResults.setBackground(Color.gray);
	panel.add(displayResults);
//	displayResults.setLocation(400,400);
	
	
	//panel
	panel.add(colorS);
	panel.add(modelS);
	panel.add(msg);
	panel.add(searchBox);
	panel.add(viewCars);
	panel.add(displayInfo);

	
	colorS.setBounds(50,20,200,50);
	modelS.setBounds(300,20,200,50);
	msg.setBounds(20,20,150,150);
	searchBox.setBounds(20,100, 150,30);
	viewCars.setBounds(180,100, 120,30);
	displayInfo.setBounds(100,150, 500,400);
	displayResults.setBounds(150,250, 400,300);

	
	
	

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
	private class viewCarsListener implements ActionListener {
		
		String input;
		public void actionPerformed(ActionEvent event) {
			
			JButton jb = (JButton) event.getSource();
			if(jb.equals(viewCars))
			{
			   input = searchBox.getText();
			   if(msg.getText().equals("Searching By Color"))
			   {   
				  results = array.SearchBycolor(input);
			   }
			  else if(msg.getText().equals("Searching By Model"))
			   {   
				  Car car= array.SearchByModel(Integer.parseInt(input));
				  results.add(car);
			   }
			   String text = "";
			   LinkedList<Car> list = array.returnList();
			   for(int i=0;i<list.size();i++)
			   {
				   text= text+list.get(i)+"\n";
			   }
			   displayResults.setText(text);
			   displayText.setText("Showing results for: "+input);
			}
			
		}
		
		
	}
			
			
		
}