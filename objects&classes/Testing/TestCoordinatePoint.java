import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestCoordinatePoint {
  public static void main(String[] args) throws FileNotFoundException {
    CoordinatePoint p1 = new CoordinatePoint();
    System.out.println(p1.toString()); // (0, 0)
    p1.setLocation(7, 8);
    System.out.println(p1.toString()); // (7, 8)
    CoordinatePoint p2 = new CoordinatePoint(15, -9);
    System.out.println(p2.getX()); // 15
    // System.out.println(p2.x); // won't compile, since x is private in CoordinatePoint
    System.out.println(p2.toString()); // (15, -9)

    System.out.println(p1.distanceTo(4, 5));
    System.out.println(p2.distanceTo(1, 3));

    CoordinatePoint p3 = new CoordinatePoint(4, 7);
    CoordinatePoint p4 = p3.xReflection();
    System.out.println(p3.toString()); // (4, 7)
    System.out.println(p4.toString()); // (4, -7)

    CoordinatePoint p5 = new CoordinatePoint(8, -6);
    CoordinatePoint p6 = new CoordinatePoint(8, -6);
    System.out.println(p5 == p6);  // false
    System.out.println(p5.isEqualTo(p6)); // true
    CoordinatePoint p7 = new CoordinatePoint(8, -5);
    System.out.println(p6.isEqualTo(p7));  // false

    CoordinatePoint p8 = new CoordinatePoint(1, 1);
    CoordinatePoint p9 = p8; // reference copy
    System.out.println(p8 == p9); // true
    System.out.println(p8.toString() + " " + p9.toString()); // (1, 1) (1, 1)
    p8.setLocation(2, 2);
    System.out.println(p8.toString() + " " + p9.toString()); // (2, 2) (2, 2)

    CoordinatePoint p10 = new CoordinatePoint(1, 1);
    // make an object copy, by calling the copy constructor
    CoordinatePoint p11 = new CoordinatePoint(p10);
    System.out.println(p10 == p11); // false
    System.out.println(p10.isEqualTo(p11)); // true
    System.out.println(p10.toString() + " " + p11.toString()); // (1, 1) (1, 1)
    p10.setLocation(2, 2);
    System.out.println(p10.toString() + " " + p11.toString()); // (2, 2) (1, 1)
    p11.setLocation(3, 3);
    System.out.println(p10.toString() + " " + p11.toString()); // (2, 2) (3, 3)

    
    CoordinatePoint p12 = new CoordinatePoint(-8, 6);
    CoordinatePoint p13 = new CoordinatePoint(4, 1);
    CoordinatePoint p14 = p12.plus(p13);
    System.out.println(p14.toString()); // (-4, 7)


    System.out.println(CoordinatePoint.ORIGIN.toString()); // (0, 0)

    CoordinatePoint p15 = CoordinatePoint.sum(p12, p13);
    System.out.println(p15.toString()); // (-4, 7)

    
    System.out.println(p1.distanceToOrigin());

    // optional:
    // Scanner sc = new Scanner(new File("point.txt"));
    // // int x = sc.nextInt();
    // // int y = sc.nextInt();
    // // CoordinatePoint p16 = new CoordinatePoint(x, y);
    // CoordinatePoint p16 = CoordinatePoint.read(sc);
    // System.out.println(p16.toString()); // (-8, 7)
  }
}