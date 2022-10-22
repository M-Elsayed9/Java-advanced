/* 
 * DO NOT MODIFY THIS FILE. You may copy it and modify its code outside of Codelab, but do not paste the modified code on Codelab. 
 * Files that do not have this notice may be modified. 
 */

public class TestCoordinatePoint {
    public static void main(String[] args) {
        CoordinatePoint p1 = new CoordinatePoint(2, 4);
        System.out.println(p1.distanceTo(new CoordinatePoint(8, -4)));

        p1.translate(-10, 7);
        System.out.println(p1.toString());
    
        CoordinatePoint p2 = p1.yReflection();
        System.out.println(p2.toString());

        CoordinatePoint p3 = p1.originReflection();
        System.out.println(p3.toString());
    }
}
