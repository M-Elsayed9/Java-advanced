/*
Primitve values are created and processed much more  
efficiently than objects are. However, there are situations in which
we need to use objects to represent primitive values, such as
ints or booleans. Corresponding to the eight primitive types,
Java provides the following eight classes: Boolean, Byte, Short, 
Integer, Long, Float, Double, and Character.

These eight classes are known as the "wrapper" classes, since each 
object of these classes is like a wrapper around a primitive value.

All eight wrapper classes are immutable classes. 

Java performs auto-boxing and auto-unboxing (see below) when necessary.
*/

public class Wrappers {
  public static void main(String[] args) {
    int x = 365;
    Integer i1 = new Integer(365); // deprecated way to create an Integer
    i1 = Integer.valueOf(365); // preferred way to create an Integer

    System.out.println(i1.toString()); // 365

    Integer i2 = 365; // uses auto-boxing to store an int as an Integer
                      // Java automatically creates the Integer object

    int i3 = i1; // uses auto-unboxing to store a copy of an Integer 
                  // as an int
    
    Double[] doubles = {
      Double.valueOf(-9.8),
      Double.valueOf(6.7),
      5.5 // uses auto-boxing
    };
    doubles[0] = 4.8; // uses auto-boxing
    double x = doubles[1]; // uses auto-unboxing

    // false, as the LHS points to a different object than the RHS
    System.out.println(Integer.valueOf(365) == Integer.valueOf(365)); 

    // true, compares contents of the two objects
    System.out.println(Integer.valueOf(365).equals(Integer.valueOf(365))); 
    
    System.out.println(Integer.valueOf(65) == Integer.valueOf(65)); // true?!
    // When we use Integer.valueOf for a "small" value, Java may simply 
    // make another reference to an already-existing object instead of 
    // creating a new object. Thus == says true here, since the LHS 
    // refers to the same object that the RHS refers to. 

    // DO NOT use == to test for object equality (that is, to determine if 
    // two objects have the same contents/state). Only use it for 
    // primitives, or to test for object identity (that is, to 
    // determine if two references point to the same object).

    // Many classes have a helpful equals method that tests for object 
    // equality.
  }
}