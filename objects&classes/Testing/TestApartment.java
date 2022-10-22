// DO NOT MODIFY THIS FILE

public class TestApartment {
    public static void main(String[] args) {
        testConstructor();
        testAddRoom();
        testGetNumRooms();
        testGetArea();
        testToString();
    }

    private static void testConstructor() {
        System.out.println("testing constructor");
        Apartment apartment = new Apartment("10E", 4);
        System.out.println(apartment.getNumRooms()); // expected: 0
        System.out.println();
    }

    private static void testAddRoom() {
        System.out.println("testing addRoom");

        Apartment apartment = new Apartment("10E", 2);

        boolean added = apartment.addRoom(new Room(10, 12));
        System.out.println(added);                   // expected: true

        added = apartment.addRoom(new Room(10, 12));
        System.out.println(added);                   // expected: true

        added = apartment.addRoom(new Room(10, 12));
        System.out.println(added);                   // expected: false

        System.out.println();
    }

    private static void testGetNumRooms() {
        System.out.println("testing getNumRooms");

        Apartment apartment = new Apartment("10E", 2);
        System.out.println(apartment.getNumRooms()); // expected: 0

        apartment.addRoom(new Room(10, 12));
        System.out.println(apartment.getNumRooms()); // expected: 1

        apartment.addRoom(new Room(11, 13));
        System.out.println(apartment.getNumRooms()); // expected: 2

        apartment.addRoom(new Room(12, 14));
        System.out.println(apartment.getNumRooms()); // expected: 2

        System.out.println();
    }

    private static void testGetArea() {
        System.out.println("testing getArea");

        Apartment apartment = new Apartment("10E", 2);
        System.out.println(apartment.getArea()); // expected: 0.0

        apartment.addRoom(new Room(5, 10));
        System.out.println(apartment.getArea()); // expected: 50.0

        apartment.addRoom(new Room(5.5, 5));
        System.out.println(apartment.getArea()); // expected: 77.5

        System.out.println();
    }

    private static void testToString() {
        System.out.println("testing toString");
        Apartment apartment = new Apartment("10E", 3);
        System.out.println(apartment.toString()); // expected: apartment 10E: []

        apartment.addRoom(new Room(10, 12));
        System.out.println(apartment.toString());
            // expected: apartment 10E: [10.0 x 12.0 room]

        apartment.addRoom(new Room(11, 13));
        System.out.println(apartment.toString());
            // expected: apartment 10E: [10.0 x 12.0 room, 11.0 x 13.0 room]

        apartment.addRoom(new Room(12, 14));
        System.out.println(apartment.toString());
            // expected: apartment 10E: [10.0 x 12.0 room, 11.0 x 13.0 room, 12.0 x 14.0 room]

        apartment = new Apartment("7B", 5);
        System.out.println(apartment.toString()); // expected: apartment 7B: []

        System.out.println();
    }
}
