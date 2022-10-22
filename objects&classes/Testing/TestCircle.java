public class TestCircle {
  public static void main(String[] args) {
    CoordinatePoint p1 = new CoordinatePoint(3, 1);
    Circle c1 = new Circle(p1, 2);
    System.out.println(c1.toString());
    Circle c2 = new Circle(p1, -2);
    System.out.println(c2.toString());
    Circle c3 = new Circle();
    System.out.println(c3.toString());
    Circle c4 = new Circle(5, 7, 3);
    System.out.println("c4: " + c4.toString()); // circle with center at
                                                // (5, 7) and radius 3.0

    Circle c5 = new Circle(c4);
    System.out.println("c5: " + c5.toString()); // circle with center at
                                                // (5, 7) and radius 3.0
    // modify location of c4
    c4.getLocation().setLocation(5, 5);
    System.out.println("c4: " + c4.toString());
    System.out.println("c5: " + c5.toString());

    System.out.println(c5.getArea());
    System.out.println(c5.getPerimeter());

    System.out.println(c5.contains(new CoordinatePoint(3, 6)));

    Circle c6 = new Circle(5, 7, 3);
    System.out.println(c5.isEqualTo(c6));
  }
}