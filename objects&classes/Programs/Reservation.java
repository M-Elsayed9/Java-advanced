/** 
 * Each object of this class represents a room reservation 
 * for a day of the week. 
 */
public class Reservation {
  private String room;
  private int dayOfWeek; // 0 represents Sunday, 1 represents Monday, etc.
  
  private static int numReservations = 0;
  private static String[] days = {
    "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
    "Friday", "Saturday"
  };

  public Reservation(String room, int dayOfWeek) {
    this.room = room; 
    this.dayOfWeek = dayOfWeek;
    numReservations++;
  }

  // static method can directly access static fields
  public static int getNumReservations() {
    return numReservations;
  }

  // instance method can directly access instance and static fields
  public String toString() {
    return "reservation for room " + room 
         + " on day " + days[dayOfWeek];  
  }

  // instance method can directly access static fields and methods
  // and it can of course access instance fields and methods
  public void good() {
    System.out.println(numReservations);
    System.out.println(getNumReservations());
    System.out.println(room);
    System.out.println(toString());
  }

  // a static method cannot directly access instance fields or methods
  // this will not compile: 
  // public static void bad() {
  //   System.out.println(room);
  //   System.out.println(toString());
  // }

  // a static method can access instance fields or methods indirectly, 
  // through an object of the class
  public static void okay() {
    Reservation r = new Reservation("4141 I", 3);
    System.out.println(r.toString());
    System.out.println(r.room);
  }
}