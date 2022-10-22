public class TestReservation {
  public static void main(String[] args) {
    System.out.println(Reservation.getNumReservations()); // 0
    Reservation r1 = new Reservation("1221 IH", 3);
    System.out.println(r1.toString());
    System.out.println(Reservation.getNumReservations()); // 1
    Reservation r2 = new Reservation("4040 BH", 0);
    System.out.println(r2.toString());
    System.out.println(Reservation.getNumReservations()); // 2

    // this also prints 2, but is considered bad style
    System.out.println(r1.getNumReservations()); //
  }
}