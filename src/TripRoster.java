import java.util.ArrayList;
import java.util.List;

public class TripRoster {

	ArrayList<Pair<Trip, Car>> pairList = new ArrayList<Pair<Trip,Car>>();
	
	
	
	public TripRoster(ArrayList<Pair<Trip,Car>> assigned_trip) {
		
		pairList = assigned_trip;
		
	}
	
	
	
	public void add_assigned_trip(Pair<Trip, Car> rostered_trip) {
		
		pairList.add(rostered_trip);
		
	}
	
}
