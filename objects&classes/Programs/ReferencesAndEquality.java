public class ReferencesAndEquality {
  public static void main(String[] args) {
    /*
    This line:
    - declares a reference variable of the Circle type ("Circle c1")
    - creates a new Circle object by calling the Circle class's 
      constructor ("new Circle(4)"), using the "new" operator, which 
      returns the address of the new object.
    - takes the address of the new object and stores it in c1 (the 
      equals symbol)
    */
    Circle c1 = new Circle(4);

    /*
    This line does not create a new object. 
    All it does is take the address that is stored in c1 
    and copies it into c2. 
    Once this line runs, both c1 and c2 point to the same object. 
    */
    Circle c2 = c1; // c2 is an alias of c1  
    
    System.out.println("c1's radius: " + c1.getRadius()); // 4
    System.out.println("c2's radius: " + c2.getRadius()); // 4

    System.out.println("\nSetting c2's radius to 5.");
    c2.setRadius(5);
    System.out.println("c1's radius: " + c1.getRadius()); // 5
    System.out.println("c2's radius: " + c2.getRadius()); // 5

    System.out.println("\nSetting c1's radius to 6.");
    c1.setRadius(6);
    System.out.println("c1's radius: " + c1.getRadius()); // 6
    System.out.println("c2's radius: " + c2.getRadius()); // 6

    System.out.println("\nCalling modify method.");
    modify(c1);
    System.out.println("c1's radius: " + c1.getRadius()); // 7
    System.out.println("c2's radius: " + c2.getRadius()); // 7

    Circle c3;
    c3 = new Circle(7);
    System.out.println("\nc1's radius: " + c1.getRadius()); // 7
    System.out.println("c2's radius: " + c2.getRadius()); // 7
    System.out.println("c3's radius: " + c3.getRadius()); // 7
    System.out.println("c1 == c2?" + (c1 == c2));  // true
    System.out.println("c1 == c3?" + (c1 == c3));  // false

    /*
    The == operator compares the values of two variables (like c1 and 
    c2), or a variable with a constant value (like comparing x with 5).
    If the two values are equal, then the result is true; otherwise, 
    it is false. 
    But what is the value of a variable? If the variable is of a 
    primitive type, like int x = 10, then the value is 10 (for example).
    But, if we're dealing with a reference variable, then its value 
    is an address. 
    c1 and c2 both store the same address, but c3 stores a 
    different address, even though c3's radius is equal to c1 and 
    c2's radius. 

    Another way of putting this is that when dealing with reference 
    variables, the == operator tests for identity (if the two
    reference variables point to the same object), not for equality
    (if the reference variables point to objects with the same contents
    as each other). 

    We will see later (when we learn about inheritance) that all 
    classes have a method named equals which, if written correctly, 
    test for equality. 
    */
  }

  public static void modify(Circle circle) {
    circle.setRadius(7);
  }
}