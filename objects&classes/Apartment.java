import java.util.Arrays;
public class Apartment {
	
	private String apartmentNumber;
	private Room[] rooms;
	private int numRooms;
	
	public Apartment(String apartmentNumber, int maxRooms) {
		this.apartmentNumber = apartmentNumber;
		this.rooms = new Room[maxRooms];
		this.numRooms = 0;
	}

	public boolean addRoom(Room room) {
		if(numRooms >= rooms.length) {
			this.rooms[numRooms] = room;
			numRooms++;
			return false;
		}else {
			this.rooms[numRooms] = room;
			numRooms++;
			return true;
		}
	}
	
	public int getNumRooms() {
		return numRooms;
	}
	
	public double getArea() {
		double sum = 0;
		if(numRooms == 0) {
			return sum;
		}else {
		for(int i = 0; i < numRooms; i++) {
			sum += rooms[i].getArea();
		}
		return sum;
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder("apartment " + apartmentNumber + ": [");
		for(int i = 0; i < numRooms; i++) {
			result.append(rooms[i].toString());
			
			if(i != numRooms-1) {
				result.append(", ");
			}
		}
		result.append("]");
		return result.toString();
	}
//		Room[] filledRooms = new Room[numRooms];
//		for(int i = 0; i < numRooms; i++) {
//			filledRooms[i] = this.rooms[i];
//		}
//		return "apartment " + this.apartmentNumber + ": " + Arrays.toString(filledRooms);
//	}
}
