
public class CoordinatePoint {

	private int x, y;
    public static final CoordinatePoint ORIGIN = new CoordinatePoint(0, 0);

    public CoordinatePoint() {
        this(0, 0);
    }

    public CoordinatePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** copy constructor */
    public CoordinatePoint(CoordinatePoint old) {
        this.x = old.x;
        this.y = old.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** Returns a string of the form "(x, y)" */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanceTo(int otherX, int otherY) {
    	int deltaX = this.x - otherX;
    	int deltaY = this.y - otherY;
    	return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}

    public double distanceToOrigin() {
        return distanceTo(ORIGIN.x, ORIGIN.y);
    }

    /** Creates and returns a CoordinatePoint based on values from sc. */
    public static CoordinatePoint read(java.util.Scanner sc) {
        int xval = sc.nextInt();
        int yval = sc.nextInt();
        CoordinatePoint p = new CoordinatePoint(xval, yval);
        return p;
    }

    /**
     * Returns a new CoordinatePoint that is a copy of this CoordinatePoint, but reflected across the x-axis.
     */
    public CoordinatePoint xReflection() {
        return new CoordinatePoint(this.x, -this.y);
    }

    public static CoordinatePoint sum(CoordinatePoint p1, CoordinatePoint p2) {
        return new CoordinatePoint(p1.x + p2.x, p1.y + p2.y);
    }

    public CoordinatePoint plus(CoordinatePoint other) {
        return new CoordinatePoint(this.x + other.x, this.y + other.y);
    }

    public boolean isEqualTo(CoordinatePoint other) {
        return this.x == other.x && this.y == other.y;
    }

    /* Add the four new methods. */
    public double distanceTo(CoordinatePoint p) {
    	return p.distanceTo(this.x,this.y);
    }
    
    public void translate(int dx, int dy) {
    	this.x += dx;
    	this.y += dy;
    }

    public CoordinatePoint yReflection() {
    	return new CoordinatePoint(-this.x, this.y);
    }
    
    public CoordinatePoint originReflection() {
    	return new CoordinatePoint(-this.x,-this.y);
    }
    
}
