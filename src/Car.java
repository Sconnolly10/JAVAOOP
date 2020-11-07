
public class Car {
	
	int id;
	int litres_in_tank;
	double km_per_litre;
	double range = 0;
	
	public Car(int car_id, int num_litres, double km_per_lit) {
		
		id = car_id;
		litres_in_tank = num_litres;		
		km_per_litre = 	km_per_lit;	
		range = litres_in_tank * km_per_litre;
	}
	
}
