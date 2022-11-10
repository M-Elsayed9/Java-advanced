import java.awt.Rectangle;

// https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Rectangle.html

public class Main {
  public static void main(String[] args) {
    int x; // declaring a variable of the int type.
           // x is a primitive variable

    // Declaring a variable of the Rectangle type.
    // myRectangle is a reference variable
    // we have not yet created a Rectangle object
    Rectangle myRectangle; 
                     
    /*
    myRectangle is a reference variable. 
    Currently, the value of myRectangle is undefined. 
    When we want to give myRectangle a value, we have two choices:
    1. It can store a reference to an object -- that is, the 
       address of an object (where the object is stored in memory).    
       In this case, we say that the variable refers, or "points," 
       to the object.
    2. It can store the value null, which means that this reference 
       variable isn't pointing to any object.  
    */

    /*
    So far, myRectangle's value is undefined -- doesn’t have a value yet. 
    Suppose we want to create a new Rectangle object and make 
    myRectangle store the address of the new object. 
    Creating an object of a class is known as instantiation. 
    To do it, we typically call a constructor of the class that we 
    want to instantiate. 
    The call to the constructor must be preceded by the 
    keyword new. 
    The goal of the constructor is to initialize the fields of
    the object (and sometimes to perform other tasks).
    */
    
    myRectangle = new Rectangle(7, 4);  
    // This creates a new Rectangle object and stores its address 
    // in myRectangle.
    // The width of the Rectangle is initalized to 7 and the
    // height is initialized to 4. The x-coordinate is initialized 
    // to 0, and the y-coordinate is also intialized to 0.

    /*
    - The Rectangle class has a few different constructors.
    - Saying new Rectangle(........) gives us the address of 
      the new object, which we can store in myRectangle
    */

    // can combine declaration and assignment into one line, 
    // like this: 
    Rectangle anotherRectangle = new Rectangle(2, 5, 8, 3);

    // This syntax should be somewhat familiar. Compare:
    // Scanner sc = new Scanner(System.in); 
    // This says: create a new Scanner object, with System.in as the
    // input to the constructor, and use sc to point to the new object.

    // How can we access the fields of an object (that is, the 
    // data stored by the object)? 
    System.out.println("myRectangle's height is " + 
        myRectangle.height);

    System.out.println("myRectangle's x-coordinate is " + 
        myRectangle.x);

    System.out.println("anotherRectangle's height is " + 
        anotherRectangle.height);

    System.out.println("anotherRectangle's x-coordinate is " + 
        anotherRectangle.x);
    
    myRectangle.x = 20;
    System.out.println("myRectangle's x-coordinate is " + 
        myRectangle.x);

    System.out.println("Does myRectangle contain the point (2, 6)?"
        + myRectangle.contains(2, 6));

    // This is possible to do because have a Circle class in 
    // the current folder.
    Circle myCircle = new Circle(2.5);

    /*
    Once we have an object, how can we call a method of its class?
    Idea: like saying sc.nextInt(); 
    We can call a method using a reference variable
    */
    System.out.println("Area of myCircle: " + myCircle.calculateArea());

 

    myRectangle = null; // now myRectangle does not point to any object
    System.out.println("myRectangle's x-coordinate is " + 
        myRectangle.x);
    // if we try to access a field (like x) or a method of a class
    // using a reference variable whose value is null, we get
    // a NullPointerException at runtime.
  }
}

/* 
To compile, enter: javac Main.java 
Because this class relies on the Circle class which is in 
Circle.java, the compiler will also compile that file. 
So the compilation wll produce two .class files:
Main.class and Circle.class

To run the program, enter: java Main
*/