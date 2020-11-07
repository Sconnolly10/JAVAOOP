import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		System.out.println("Hello World" + "Stephen");
		Fleet fleet = new Fleet(1);
		TripCollection trips = new TripCollection(1);
		
		
		try {
		      File cars_file = new File("cars.txt");

		      Scanner myReader = new Scanner(cars_file);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        
		        String [] pieces = data.split("\\s+");
		    
		        int id = Integer.parseInt(pieces[0]);
		        int litres = Integer.parseInt(pieces[1]);
		        int kms_per_litre = Integer.parseInt(pieces[2]);
		        
		        Car car = new Car(id, litres, kms_per_litre); 
		        fleet.add_car(car);
		        
		        System.out.println(car.range);
		        System.out.println(data);
		      }
		      
		      System.out.println(fleet.fleet_cars);
		      
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		try {
		      File trips_file = new File("trips.txt");

		      Scanner myReader = new Scanner(trips_file);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String [] pieces = data.split("\\s+");
		        int id = Integer.parseInt(pieces[0]);
		        int distance = Integer.parseInt(pieces[1]);
		        Trip trip = new Trip(id, distance);
		        trips.add_trip(trip);
		        
		        
		        System.out.println(data);
		      }
		      
		      System.out.println(trips.collection_trips);
		      
		      
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		ArrayList<Car> sorted_cars = fleet.sort_cars(fleet.fleet_cars);
		ArrayList<Trip> sorted_trips = trips.sort_trips(trips.collection_trips);
		ArrayList<Pair<Trip, Car>> assigned_trips = new ArrayList<Pair<Trip, Car>>();
		
		for(int i=0; i < sorted_cars.size(); i++) {
			
			Car curr_car = sorted_cars.get(i);
			Trip curr_trip = sorted_trips.get(i);
			Pair<Trip, Car> assigned_trip = new Pair<Trip, Car>(curr_trip, curr_car); 
			assigned_trips.add(assigned_trip);	
		}
		
		
		for(Pair<Trip, Car> assigned_trip_loop: assigned_trips) {
			System.out.println("Assigned trip " + assigned_trip_loop.trip.trip_id + " with car " + assigned_trip_loop.car.id);
		}
			
	}
	
	
	
	
}
