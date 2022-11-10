import java.lang.String; // not necessary

public class Strings {
  public static void main(String[] args) {
    // A String is a kind of object.
    // The String class comes built-in with Java.
    // All classes are part of a package. Normally, we import a
    // class in order to use it (e.g., import java.util.Scanner).
    // String is part of the java.lang pacakge. Since the classes
    // in the java.lang package are used so commonly, Java does not
    // reqire you to import them -- they're imported automatically.

    String s1 = "hello";
    // Strings are unusual in that they can be created without
    // explictly calling the constructor

    String s2 = new String("hello"); // explicitly calling constructor, 
                            // which isn't really necessary for Strings

    System.out.println(s1 == s2); // false

    // callling a method of the String class to determine if
    // the two objects have the same contents (even though
    // s1 and s2 point to two different objects)
    System.out.println(s1.equals(s2)); // true

    // Strings are immutable -- once a String object is created, it
    // cannot be modified.

    String myString = "hello world";

    myString = "goodbye";
    // Now myString refers to a new String object. The original one
    // can no longer be accessed and the memory it was taking up
    // will be reclaimed by the "garbage collector."

    myString.replace('o', 'a');
    System.out.println(myString); // goodbye

    // create a new String object and use myString to refer to the
    // new object. The original String object is not modified! 
    // The original String object is no longer accessible.
    myString = myString.replace('o', 'a');
    System.out.println(myString); // gaadbye

    myString.toUpperCase();
    System.out.println(myString); // gaadbye

    String myUpperCaseString = myString.toUpperCase();
    System.out.println("myString: " + myString); // gaadbye
    System.out.println("myUpperCaseString: " + myUpperCaseString);
                                                      // GAADBYE

    
    // Is the Circle class immutable?
    // No, since it is possible to modify the radius field of a 
    // Circle object.
    // So the circle class is MUTABLE.


    String s = "hello"; // creates one String object
    s += " ";  // creates a new String object 
    s += "world"; // creates a third String object
    // A total of three String objects have been created in the above three lines.
    // Each time Java has to create a new object, it takes a little bit of time. 
    
    String[] days = {
      "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
      "Friday", "Saturday"
    };
    System.out.println(concatenate(days));
    System.out.println(concatenateUsingStringBuilder(days));
  }

  
  public static void stringInterning() {
    String newString1 = new String("hello");
    String newString2 = new String("hello");
    System.out.println(newString1 == newString2); // false
    System.out.println(newString1.equals(newString2));
    
    String intern1 = "goodbye";
    String intern2 = "goodbye";
    System.out.println(intern1 == intern2); // true

    // When we attempt to create a String without calling the String
    // constructor, 
    // if there is a pre-existing String that is equal to the one we 
    // want to create,
    // Java might not create a new String object and instead might 
    // just make another 
    // reference to the pre-existing String. Java might do this in 
    // order to save memory 
    // and avoid the cost of creating a new object. This is known as
    // string interning. But Java is not 
    // required to do this,
    // and might not do in under certain circumstances.

    // DO NOT use == to compare Strings (or any other kind of object) 
    // for equality. The String class has a nice equals method; 
    // use it instead. 
    // Use == to test primitives for equality, or to test for 
    // object identity (that is,
    // if you want to determine if two references point to the same 
    // object). 
  }

  // not efficient, since many String objects must be created in order to 
  // produce the final result
  public static String concatenate(String[] strings) {
    String result = "";
    
    for (String s : strings) {
      result += s; // each time this line is run, 
                   // a new String object is created
    }
    
    return result;
  }

  // StringBuilder -- similar to String, but mutable 
  // only one StringBuilder object is created in this method 
  // and only one String
  public static String concatenateUsingStringBuilder(String[] strings) {
    StringBuilder result = new StringBuilder();

    for (String s : strings) {
      result.append(s); 
    }

    return result.toString();
  }
}