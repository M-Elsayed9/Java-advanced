public class UseCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle(23);
    Circle c2 = new Circle(45);

    System.out.println("c1's area: " + c1.calculateArea());
    System.out.println("c2's area: " + c2.calculateArea());
  }
}