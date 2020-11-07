public class Pair<Trip, Car> {
    
	public Trip trip;
    public Car car;
    public Pair(Trip trip, Car car){
        this.trip = trip;
        this.car = car;
    }
    
    public Trip getTrip(){ 
    	return trip; 	
    }
    
    public Car getCar(){ 
    	return car; 
    }
    
    public void setTrip(Trip trip){ 
    	this.trip = trip; 
    }
    
    public void setCar(Car car){ 
    	this.car = car; 	
    }
}
