public class Circle {
  private CoordinatePoint location;
  private int radius;

  public Circle() {
    // this.location = CoordinatePoint.ORIGIN;
    // this.radius = 0;

    // equivalent to the above two lines:
    this(CoordinatePoint.ORIGIN, 0);
  }

  public Circle(CoordinatePoint location, int radius) {
    this.location = location;
    
    // if (radius < 0) {
    //   this.radius = 0;
    // } else {
    //   this.radius = radius; 
    // } 

    this.radius = (radius < 0)? 0 : radius;
  }

  public Circle(int x, int y, int radius) {
    this(new CoordinatePoint(x, y), radius);
  }

  // bad version -- shallow copy
  // public Circle(Circle old) {
  //   this.location = old.location;
  //   this.radius = old.radius;
  // }

  // perform a deep copy
  public Circle(Circle old) {
    this.location = new CoordinatePoint(old.location);
    this.radius = old.radius;
  }

  public CoordinatePoint getLocation() {
    return location;
  }

  public int getRadius() {
    return radius;
  }

  public String toString() {
    return "circle with center at " + location.toString() + " and radius " + radius;
  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  public boolean contains(CoordinatePoint p) {
    return location.distanceTo(p.getX(), p.getY()) < radius;
  }

  public boolean isEqualTo(Circle other) {
    return this.location.isEqualTo(other.location) && this.radius == other.radius;
  }
}