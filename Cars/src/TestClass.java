import java.util.LinkedList;

import junit.framework.TestCase;

public class TestClass extends TestCase  {
      
	CarArray sortedCarlist, carlist3, carlist4, carlist5;
	Car car1,car2, car3,car4,car5,car6;
	CarArray carlist1=new CarArray();
	
	
	
	public void setup() {
		car1=new Car("Mercedes", 100, "Black", 20000, 2015);
		car2=new Car("Honda Civic", 200, "jetBlack", 15000, 2013);
		car3=new Car("Mercedes", 300, "Green", 30000, 2019);
		car4=new Car("BMW", 400, "Blue", 45000, 2018);
		car5=new Car("Ferrari", 500, "Red", 56000, 2020);
		car6=new Car("Porsche", 600, "Silver", 74000, 2020);
		carlist1.addCar(car1);
		carlist1.addCar(car2);
		carlist1.addCar(car3);
		carlist1.addCar(car4);
		carlist1.addCar(car6);
		
		
}
	public void test01() {
		boolean Sorted=true;
		for(int i=0;i<carlist1.size()-2;i++) {
			if(carlist1.get(i).compareTo(carlist1.get(i+1))==-1) {
				Sorted=true;
			}
			else {
				Sorted=false;
			}
		}
		assertTrue(Sorted);
	}
	



public void test02() {
	
}

}
