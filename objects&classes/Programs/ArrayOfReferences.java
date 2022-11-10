import java.awt.Rectangle;

public class ArrayOfReferences {
  public static void main(String[] args) {
    Rectangle[] rectangles = new Rectangle[3];
    // Each element of the array is a Rectangle reference, not 
    // an object. Each element of the array has the ability 
    // to store the address of a Rectangle object. 
    System.out.println("Initial value of rectangles[0]: " + rectangles[0]);
    // the current value of each element is null, indicating that they
    // don't point currently to any objects
    
    System.out.println();
    
    for (int i = 0; i < rectangles.length; i++) {
      rectangles[i] = new Rectangle(i, i * 2);
    }

    System.out.println();

    for (int i = 0; i < rectangles.length; i++) {
      System.out.println(rectangles[i].toString());
    }

    System.out.println();

    // using an enhanced for loop:
    for (Rectangle r : rectangles) {
      System.out.println(r.toString());
    }

    System.out.println();

    // this has no effect on the elements of the array:
    for (Rectangle r : rectangles) {
      r = new Rectangle(0, 0);
    }
    // an enhanced for loop does not have the ability to assign 
    // new values to the elements of the array.

    for (Rectangle r : rectangles) {
      System.out.println(r.toString());
    }

    System.out.println();
    
    // calling method in enhanced for loop --
    // This doesn't modify the elements of the array, each of which is 
    // a reference to (that is, an address of) a Rectangle object. 
    // It does modify the Rectangle objects. 
    for (Rectangle r : rectangles) {
      r.setSize(0, 0);
    }

    for (Rectangle r : rectangles) {
      System.out.println(r.toString());
    }
  }
}

/* 
This enhanced for loop:
  for (Rectangle r : rectangles) {
    // do something with r
  }
is equivalent to the following old-fashioned for loop:
  for (int i = 0; i < rectangles.length; i++) {
    Rectangle r = rectangles[i];
    // do something with r
  }
*/