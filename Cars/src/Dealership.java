import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
public class Dealership extends JFrame {
 /**
	 * 
	 */
	private static final long serialVersionUID = -3923837121202197985L;
//t
 private JLabel head;	
 private JLabel msg;
 private JButton colorS;
 private JButton modelS;
 private JTextField searchBox;
 private JButton viewCars;
 private JPanel displayInfo;
 private JLabel displayText;
 private JLabel displayResults;
 private CarArray carlist1;
 private CarArray results;
 JTextArea textarea;
 Car car2,car3,car4,car5,car6,car8,car9,car10,car11,car12,car13,car14,car15;
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
	
	
	results = new CarArray();
	carlist1 = new CarArray();
	car2=new Car("Honda Civic", 200, "jetBlack", 15000, 2013);
	car3=new Car("Mercedes", 300, "Green", 30000, 2019);
	car4=new Car("BMW", 400, "Green", 45000, 2018);
	car5=new Car("Ferrari", 500, "Green", 56000, 2020);
	car6=new Car("Porsche", 600, "Silver", 74000, 2020);
	carlist1.addCar(new Car("Mercedes", 100, "Black", 20000, 2015));
	carlist1.addCar(car2);
	carlist1.addCar(car3);
	carlist1.addCar(car4);
	carlist1.addCar(car6);
	carlist1.addCar(car5);

	msg = new JLabel("");
	 
	colorS = new JButton("Search By Color");    //Search Color Button
	colorS.setOpaque(true);
	colorS.setBorderPainted(false);
	colorS.setForeground(Color.BLACK);
	colorS.setBackground(Color.getColor("lightblue"));
    colorS.addActionListener(new ButtonListener());
     
    
	modelS = new JButton("Search By Model");   //Search Model Button
	modelS.setOpaque(true);
	modelS.setBorderPainted(false);
	modelS.setForeground(Color.BLACK);
	modelS.setBackground(Color.getColor("lightgreen"));
	modelS.addActionListener(new ButtonListener());
	
	searchBox = new JTextField("Enter Info");     //User will enter info
	
	viewCars = new JButton("View Cars");        //Click after entering info
	viewCars.setOpaque(true);
	viewCars.setBorderPainted(false);
	viewCars.setForeground(Color.BLACK);
	viewCars.setBackground(Color.BLUE);
	viewCars.addActionListener(new viewCarsListener());
	
	displayInfo = new JPanel();        //panel to displayCars
	displayInfo.setOpaque(true);
	displayInfo.setForeground(Color.BLUE);
	displayInfo.setBackground(Color.WHITE);
	displayInfo.setLayout(null);
	//displayInfoPanel just prints text for now 
	displayText = new JLabel("Displaying Results");
	displayText.setBounds (200, 0,200,50);
	textarea=new JTextArea("");
	textarea.setBackground(Color.GRAY);
	textarea.setBounds(100, 100, 300, 300);
	textarea.setEditable(false);
	displayInfo.add(textarea);
	displayInfo.add(displayText);
	
	displayResults = new JLabel("H");
	
	
	//display results
	/*displayResults.setOpaque(true);
	displayResults.setBackground(Color.gray);
	panel.add(displayResults);*/
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
	//displayResults.setBounds(300,300, 300,300);

	
	
	

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

				   textarea.setText(""); //must clear textarea
				  results = carlist1.SearchBycolor(input);
				  String f=" ";
				  for(int i=0;i<results.size();i++) {
				f=f+ results.get(i).toString();
				
				  }
				 textarea.append(f);
				 
				 results.clearList();	 
					  //displayInfo.setText(f);
					 
			   }
			  else if(msg.getText().equals("Searching By Model"))
			   {   
				  textarea.setText("");  //must clear textarea
				  Car car= carlist1.SearchByModel(Integer.parseInt(input));
				  results.addCar(car);
			   
				 textarea.append(car.toString());
				 results.clearList();
			   }
			   
			
		      }
		
		
	}
			
			
		

}	
}

