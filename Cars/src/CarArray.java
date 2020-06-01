
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class CarArray {
	
	private LinkedList<Car> carslist ;
	
	
	public CarArray() {
		carslist=new LinkedList<Car>();
	}
	
	
	
	public void addCar(Car car) {
		if(car==null) {
			return;
		}
		carslist.add(car);
		sort();
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
	
	public List<Car> SearchByprice(double lowrange, double highrange){
		List<Car> list =new LinkedList<Car>();
		
		for(Car car: carslist) {
			if(car.getPrice()>=lowrange&&car.getPrice()<=highrange) {
				list.add(car);
			}
		}
		if(list.isEmpty()) {
			 throw new NoSuchElementException("A Car does not exist between that price range");
		}
		return list;
		
	 
	}
	
	public void sort() {
		MergeSort(carslist,0,carslist.size()-1);
	}



	private void MergeSort(LinkedList<Car> carslist1, int start, int end) {
		
		if(start>end) {
			return;
		}
		int mid=(start+end)/2;
		MergeSort(carslist1,start,mid-1);
		MergeSort(carslist1,mid+1,end);
		Merge(carslist,start,mid,end);
		
	}



	private void Merge(LinkedList<Car> carslist2, int start, int mid, int end) {
		LinkedList<Car> list=new LinkedList<Car>();
		
		int countLeft=start;
		int countRight=mid+1;
		int k=0;
		while(countLeft<=mid&&countRight<=end) {
			if(carslist2.get(countLeft).compareTo(carslist2.get(countRight))==-1){
				list.add(k, carslist2.get(countLeft));
				countLeft++;
				k++;
			}
			else {
				list.add(k,carslist2.get(countRight));
				countRight++;
				k++;
			}
		}
		
		if(countLeft<=mid) {
			while(countLeft<=mid) {
				list.add(k,carslist2.get(countLeft));
				k++;
				countLeft++;
			}
		}
		
		else if(countRight<=end) {
			while(countRight<=end) {
				list.add(k, carslist2.get(countRight));
				k++;
				countRight++;
			}
		}
		
		for(int i=start;i<list.size();i++) {
			list.add(start,carslist2.get(i));
			start++;
		}
	}
	
	public int size() {
		return carslist.size();
	}


}
