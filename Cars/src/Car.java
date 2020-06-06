import java.util.List;

public class Car {
     
	
	@Override
	public String toString() {
//		return " Car name: " + name + " Price: " + price 
//			+  " Year:" + year + " Modelno:" + Modelno  
//			+ " Color:" + color+"\n"+"______________________________________________________________________" ;
		
		return "\n"+name+"       "+price +"       "+ year+"       "+Modelno+"       " + color+
		"\n"+"______________________________________________________________________" ;
	}


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





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Modelno;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Modelno != other.Modelno)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	public int compareTo(Car car) {
		if(car.getName().charAt(0)<this.name.charAt(0)) {
			return 1;
		}
		else if(car.getName().charAt(0)>this.name.charAt(0)) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
