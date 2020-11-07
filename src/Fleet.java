import java.util.ArrayList;
import java.util.List;

public class Fleet {
	
	
	int id;
	ArrayList<Car> fleet_cars = new ArrayList<Car>();
	
	public Fleet(int fleet_id) {
		
		id = fleet_id;	
	}
	
	public void add_car(Car car) {
		
		fleet_cars.add(car);
		System.out.println(fleet_cars);
		
	}
	
	
	
	public ArrayList<Car> sort_cars(ArrayList<Car> fleet_cars){
		
		
		for(int i=0; i < fleet_cars.size(); i++){
			
			for(int j=1; j < fleet_cars.size(); j++) {
				
				Car curr = fleet_cars.get(j);
				Car previous = fleet_cars.get(j-1);
				
				if(curr.range < previous.range) {
					
					Car temp = previous;
					fleet_cars.set(j-1, curr);
					fleet_cars.set(j, temp);
				}
			}
		}
		
		
		return fleet_cars;
	}

}
