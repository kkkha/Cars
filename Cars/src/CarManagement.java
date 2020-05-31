import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CarManagement {
	
	private LinkedList<Car> carslist ;
	
	
	public CarManagement() {
		carslist=new LinkedList<Car>();
	}
	
	
	
	public void addCar(Car car) {
		if(car==null) {
			return;
		}
		carslist.add(car);
	}
	
	
	public LinkedList<Car> SearchBycolor(String color){
		LinkedList <Car> list= new LinkedList<Car>();
		
            for(Car car: carslist) {
            	if(car.getColor().equals(color)) {
            		list.add(car);
            	}
            }
            if(list.isEmpty()) {
            	throw new NoSuchElementException("There is no car with that color");
            }
            return list;
	}
	
	public LinkedList<Car> SearchByName(String name){
		LinkedList <Car> list= new LinkedList<Car>();
		
            for(Car car: carslist) {
            	if(car.getName().equals(name)) {
            		list.add(car);
            	}
            }
            if(list.isEmpty()) {
            	throw new NoSuchElementException("There is no car with that color");
            }
            return list;
	}
	
	public Car SearchByModel(int Modelno){

		  for(Car car: carslist) {
            	if(car.getModelno()==Modelno) {
            		return car;
            	}
            }
		  
			  throw new NoSuchElementException("There is no such car with that model no");
		  
	}
	
	public list<Car> SearchByprice(double lowrange, double highrange){
		//To do Implement this method 
	
	}
	
	
/* Implement all the other methods you can think of 
 * please. its upto you if you want you can change my methods as well
 * 
 * 
 * 
 * 
 */
	

}
