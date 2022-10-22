/* 
 * DO NOT MODIFY THIS FILE. You may copy it and modify its code outside of Codelab, but do not paste the modified code on Codelab. 
 * Files that do not have this notice may be modified. 
 */
 
public class TestRectangle {
    public static void main(String[] args) {
        // using the first four constructors
        Rectangle[] rectangles = {
            new Rectangle(),
            new Rectangle(-5, 3),        // width should be 0
            new Rectangle(new CoordinatePoint(0, 0), 2, 4),
            new Rectangle(-2, 3, 4, -5)  // height should be 0
        };

        // using toString()
        for (Rectangle r : rectangles) {
            System.out.println(r.toString() + ", area: " + r.getArea() + ", perimeter: " + r.getPerimeter() + ", diagonal: " + r.getDiagonal());
        }

        // using the copy constructor
        System.out.println();
        Rectangle r = new Rectangle(rectangles[2]);
        System.out.println(r.isEqualTo(rectangles[2]));
        r.getLocation().setLocation(1, 1);
        System.out.println(r.toString());
        System.out.println(rectangles[2].toString());
        System.out.println(r.isEqualTo(rectangles[2]));

        // using the contains methods
        System.out.println();
        System.out.println(r.toString());
        System.out.println(r.contains(new CoordinatePoint(2, 0)));
        System.out.println(r.contains(new CoordinatePoint(2, 1)));
        System.out.println(r.contains(CoordinatePoint.ORIGIN));
        System.out.println(r.contains(1, 1));
    }
}
