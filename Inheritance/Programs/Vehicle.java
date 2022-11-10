package inheritance;

public class Vehicle {

	private int numSeats;
	private int numPassengers;
	
	public Vehicle(int numSeats) {
		this.numPassengers = 0;
		this.numSeats = numSeats;
	}
	
	public int getNumSeats() {
		return this.numSeats;
	}
	
	public int getNumPassengers() {
		return this.numPassengers;
	}
	
	public boolean addPassenger() {
		if (numSeats == numPassengers) {
			return false;
		}else {
			numPassengers++;
			return true;
		}
	}
}
 class Car extends Vehicle {

	 private int numDoors;
	 
	 public Car() {
		 super(5);
		 this.numDoors = 4;
	 }
	 
	public Car(int numSeats, int numDoors) {
		super(numSeats);
		this.numDoors = numDoors;
	}
	
	public int getNumDoors() {
		return numDoors;
	}
	 
 }
 
 class Truck extends Vehicle {
	 private int maxCargoWeight;
	 private int cargoWeight;
	 
	 public Truck(int maxCargoWeight) {
		 super(2);
		 this.cargoWeight = 0;
		 this.maxCargoWeight = maxCargoWeight;
	 }
	 
	 public Truck(int numSeats, int maxCargoWeight) {
		 super(numSeats);
		 this.cargoWeight = 0;
		 this.maxCargoWeight = maxCargoWeight;
	 }
	 public int getMaxCargoWeight() {

		 return this.maxCargoWeight;
	 }
	 
	 public int getCargoWeight() {

		 return this.cargoWeight;
	 }
	 
	 public boolean addCargo(int weight) {
		 if((this.cargoWeight + weight) >= this.maxCargoWeight) {
			 return false;
		 }
		 this.cargoWeight += weight;
		 return true;
	 }
 }