
public class Room {

	private double length;
	private double width;
	
	public Room(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return this.length * this.width;
	}
	
	public String toString() {
		return this.length + " x " + this.width + " Room";
	}
	
}
