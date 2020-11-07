import java.util.ArrayList;
import java.util.List;

public class TripCollection {

	
	
	int id;
	ArrayList<Trip> collection_trips = new ArrayList<Trip>();
	
	public TripCollection(int trip_collection_id) {
		
		id = trip_collection_id;	
	}
	
	
	public void add_trip(Trip trip) {
		
		collection_trips.add(trip);
	}
	
	public ArrayList<Trip> sort_trips(ArrayList<Trip> collection_trips){
			
			
			for(int i=0; i < collection_trips.size(); i++){
				
				for(int j=1; j < collection_trips.size(); j++) {
					
					Trip curr = collection_trips.get(j);
					Trip previous = collection_trips.get(j-1);
					
					if(curr.trip_distance < previous.trip_distance) {
						
						Trip temp = previous;
						collection_trips.set(j-1, curr);
						collection_trips.set(j, temp);
					}
				}
			}
			
			
			return collection_trips;
		}
	
}
