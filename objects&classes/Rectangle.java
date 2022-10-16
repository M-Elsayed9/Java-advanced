
public class Rectangle {

	private CoordinatePoint location;
	private int width;
	private int height;
	
	public Rectangle() {
		this.location = new CoordinatePoint(0,0);
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(int width, int height) {
		this.location = new CoordinatePoint(0,0);
		
		if(width >= 0) {
			this.width = width;
		}else {
			this.width= 0;
		}
		
		if(height >= 0) {
			this.height = height;
		}else {
			this.height = 0;
		}
	}
	
	public Rectangle(CoordinatePoint location, int width, int height) {
		this.location = location;
		if(width >= 0) {
		this.width =width;
		}else {
			this.width = 0;
		}
		if(height >= 0) {
		this.height = height;
		}else {
			this.height = 0;
		}
	}
	
	public Rectangle(int x, int y, int width, int height) {
		this.location = new CoordinatePoint(x, y);
		
		if(width >= 0) {
			this.width = width;
		}else {
			this.width = 0;
		}
		if(height >= 0) {
			this.height = height;
		}else {
			this.height = 0;
			}
	}
	
	public Rectangle(Rectangle rectangle) {
		this.location = new CoordinatePoint(rectangle.location);
		this.width = rectangle.width;
		this.height = rectangle.height;
	}
	
	public String toString() {
		return "rectangle: location=" + getLocation() + ", width=" + getWidth() + ", height=" + getHeight();
	}


	public CoordinatePoint getLocation() {
		return this.location;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}
	
	public double getDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); 
	}
	
	public boolean isEqualTo(Rectangle other) {
		if(this.location.isEqualTo(other.location) && this.width == other.width && this.height == other.height) {
			return true;
		}else return false;
	}
	
	public boolean contains(int x, int y) {
		return  x > this.location.getX() && x < this.location.getX() + width
				&& y == this.location.getY()-1 && y < this.location.getY() + height;
	}
	
	public boolean contains(CoordinatePoint point) {
		return contains(point.getX(), point.getY());
				
//				point.getX() > this.location.getX() && point.getX() < this.location.getX() + width
//				  && point.getY() > this.location.getY() && point.getY() < this.location.getX() + height;

	}
}
