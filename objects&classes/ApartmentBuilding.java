import java.util.Arrays;

public class ApartmentBuilding {

	private Apartment[] apartments;
	private int numApartments;
	
	public ApartmentBuilding(int maxApartments) {
		this.apartments = new Apartment[maxApartments];
		this.numApartments = 0;
	}
	
	public int getNumApartments() {
		return this.numApartments;
	}
	
	public boolean addApartment(Apartment apartment) {
		if(apartments[apartments.length-1] == null) {
			this.apartments[numApartments] = apartment;
			numApartments++;
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < numApartments; i++) {
			sb.append(apartments[i].toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public double getArea() {
		double area = 0;
		for(int i = 0; i < numApartments; i++) {
			area += apartments[i].getArea();
		}
		return area;
	}
	
	public Apartment findApartmentInRange(double low, double high) {
		for(int i =0; i < numApartments; i++) {
			double apartmentArea = apartments[i].getArea();
			if(apartmentArea >= low && apartmentArea <= high) {
				return apartments[i];
			}
		}
		return null;
	}
}
