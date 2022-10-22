public class TestRoom {
    public static void main(String[] args) {
        Room room1 = new Room(10.5, 20.5);
        System.out.println(room1.getArea());  // expected: 215.25
        System.out.println(room1.toString()); // expected: 10.5 x 20.5 room

        Room room2 = new Room(15.0, 12.5);
        System.out.println(room2.getArea());  // expected: 187.5
        System.out.println(room2.toString()); // expected: 15.0 x 12.5 room
    }
}