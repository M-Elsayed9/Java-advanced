public class InstanceVsStatic {
  public static void main(String[] args) {
    Circle c1 = new Circle(4);
    Circle c2 = new Circle(5);

    // Calling getRadius, which is an instance method. Each time 
    // we call an instance method we are trying to do something 
    // with or find something out about a *particular* object. 
    // When we say "c1.getRadius()", we want to know the radius
    // of the object that c1 refers to. 
    // When we say "c2.getRadius()", we want to know the radius
    // of the object that c2 refers to. 
    // In order to call an instance method, we must first
    // create an object.
    System.out.println("c1's radius: " + c1.getRadius()); // 4
    System.out.println("c2's radius: " + c2.getRadius()); // 5

    // calculateArea is also an instance method
    System.out.println("c1's area: " + c1.calculateArea());

    // A static method does not pertain to any particular object.
    // It can be called without creating an object. We use the 
    // name of the class to call a static method.
    // sqrt is a static method in the Math class 
    System.out.println(Math.sqrt(25));
  }
}