
public class Car {
     
	
	private String name;
	private int Modelno;
	private String color;
	private double price;
	private int year;
	
	
	
	public Car(String name, int modelno, String color, double price, int year) {
		super();
		this.name = name;
		Modelno = modelno;
		this.color = color;
		this.price = price;
		this.year = year;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelno() {
		return Modelno;
	}
	public void setModelno(int modelno) {
		Modelno = modelno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
}
