package inheritance;

//DO NOT MODIFY THIS FILE.

public class TestRational {
 public static void main(String[] args) {
     testExtendsNumber();
     testEquals();
 }

 private static void testExtendsNumber() {
     System.out.println("testing extends Number");

     Number rational1 = new Rational("3/2");
     System.out.println(rational1.intValue());    // expected: 1
     System.out.println(rational1.longValue());   // expected: 1
     System.out.println(rational1.floatValue());  // expected: 1.5
     System.out.println(rational1.doubleValue()); // expected: 1.5

     Number rational2 = new Rational("5/2");
     System.out.println(rational2.intValue());    // expected: 2
     System.out.println(rational2.longValue());   // expected: 2
     System.out.println(rational2.floatValue());  // expected: 2.5
     System.out.println(rational2.doubleValue()); // expected: 2.5

     System.out.println();
 }

 private static void testEquals() {
     System.out.println("testing equals");

     Number rational1 = new Rational("3/2");
     System.out.println(rational1.equals(rational1));  // expected: true
     Number rational2 = new Rational("3/2");
     System.out.println(rational1.equals(rational2));  // expected: true
     Number rational3 = new Rational("5/2");
     System.out.println(rational1.equals(rational3));  // expected: false
     System.out.println(rational1.equals("a String")); // expected: false
     System.out.println(rational1.equals(null));       // expected: false

     System.out.println();
 }
}
