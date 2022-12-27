// DO NOT MODIFY THIS FILE.

public class TestPhonebookEntry {
    public static void main(String[] args) {
        testConstructor();
        testAddPhoneNumber();
        testDeletePhoneNumber();
        testContainsPhoneNumber();
        testEquals();
        testToString();
        testToCsvString();
    }

    private static void testConstructor() {
        System.out.println("testing constructor");
        Name name = new Name("Jane", "Doe");
        PhonebookEntry phonebookEntry = new PhonebookEntry(name);
        System.out.println(phonebookEntry.getName());         // expected: Jane Doe
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: []
        System.out.println();
    }

    private static void testAddPhoneNumber() {
        System.out.println("testing addPhoneNumber");

        Name name = new Name("Jane", "Doe");
        PhonebookEntry phonebookEntry = new PhonebookEntry(name);
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: []

        // add one phone number
        boolean success = phonebookEntry.addPhoneNumber(new PhoneNumber("111-111-1111"));
        System.out.println(success);                          // expected: true
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111]

        // add a second phone number
        success = phonebookEntry.addPhoneNumber(new PhoneNumber("222-222-2222"));
        System.out.println(success);                          // expected: true
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 222-222-2222]

        // add a third phone number
        success = phonebookEntry.addPhoneNumber(new PhoneNumber("333-333-3333"));
        System.out.println(success);                          // expected: true
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 222-222-2222, 333-333-3333]

        // attempt to add a duplicate phone number (should not be added)
        success = phonebookEntry.addPhoneNumber(new PhoneNumber("111-111-1111"));
        System.out.println(success);                          // expected: false
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 222-222-2222, 333-333-3333]

        // again attempt to add a duplicate phone number (should not be added)
        success = phonebookEntry.addPhoneNumber(new PhoneNumber("222-222-2222"));
        System.out.println(success);                          // expected: false
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 222-222-2222, 333-333-3333]

        // again attempt to add a duplicate phone number (should not be added)
        success = phonebookEntry.addPhoneNumber(new PhoneNumber("333-333-3333"));
        System.out.println(success);                          // expected: false
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 222-222-2222, 333-333-3333]

        System.out.println();
    }

    private static void testDeletePhoneNumber() {
        System.out.println("testing deletePhoneNumber");

        Name name = new Name("Jane", "Doe");
        PhonebookEntry phonebookEntry = new PhonebookEntry(name);
        phonebookEntry.addPhoneNumber(new PhoneNumber("111-111-1111"));
        phonebookEntry.addPhoneNumber(new PhoneNumber("222-222-2222"));
        phonebookEntry.addPhoneNumber(new PhoneNumber("333-333-3333"));
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 222-222-2222, 333-333-3333]

        // delete a phone number
        PhoneNumber toRemove = new PhoneNumber("222-222-2222");
        boolean success = phonebookEntry.deletePhoneNumber(toRemove);
        System.out.println(success);                          // expected: true
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 333-333-3333]

        // attempt to delete a non-existent phone number
        toRemove = new PhoneNumber("555-555-5555");
        success = phonebookEntry.deletePhoneNumber(toRemove);
        System.out.println(success);                          // expected: false
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 333-333-3333]

        System.out.println();
    }

    private static void testContainsPhoneNumber() {
        System.out.println("testing containsPhoneNumber");

        Name name = new Name("Jane", "Doe");
        PhonebookEntry phonebookEntry = new PhonebookEntry(name);
        phonebookEntry.addPhoneNumber(new PhoneNumber("111-111-1111"));
        phonebookEntry.addPhoneNumber(new PhoneNumber("222-222-2222"));
        System.out.println(phonebookEntry.getPhoneNumbers()); // expected: [111-111-1111, 222-222-2222]

        System.out.println(phonebookEntry.containsPhoneNumber(new PhoneNumber("111-111-1111"))); // expected: true
        System.out.println(phonebookEntry.containsPhoneNumber(new PhoneNumber("222-222-2222"))); // expected: true
        System.out.println(phonebookEntry.containsPhoneNumber(new PhoneNumber("333-333-3333"))); // expected: false

        // delete a phone number and then check if it exists
        phonebookEntry.deletePhoneNumber(new PhoneNumber("111-111-1111"));
        System.out.println(phonebookEntry.containsPhoneNumber(new PhoneNumber("111-111-1111"))); // expected: false

        System.out.println();
    }

    private static void testEquals() {
        System.out.println("testing equals");

        // -------------------------- test case 1 --------------------------

        PhonebookEntry entry1 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry1.addPhoneNumber(new PhoneNumber("111-111-1111"));
        entry1.addPhoneNumber(new PhoneNumber("222-222-2222"));
        entry1.addPhoneNumber(new PhoneNumber("333-333-3333"));

        PhonebookEntry entry2 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry2.addPhoneNumber(new PhoneNumber("222-222-2222"));
        entry2.addPhoneNumber(new PhoneNumber("333-333-3333"));
        entry2.addPhoneNumber(new PhoneNumber("111-111-1111"));

        // entry1 and entry2 have equal names and equal phone numbers (albeit in different orders), so they're considered equal
        System.out.println("case 1: " + entry1.equals(entry2)); // expected: true

        // -------------------------- test case 2 --------------------------

        entry1 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry1.addPhoneNumber(new PhoneNumber("111-111-1111"));
        entry1.addPhoneNumber(new PhoneNumber("222-222-2222"));
        entry1.addPhoneNumber(new PhoneNumber("333-333-3333"));

        entry2 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry2.addPhoneNumber(new PhoneNumber("111-111-1111"));
        entry2.addPhoneNumber(new PhoneNumber("333-333-3333"));

        // entry2 is missing one of entry1's phone numbers, so they're not equal
        System.out.println("case 2: " + entry1.equals(entry2)); // expected: false

        // -------------------------- test case 3 --------------------------

        entry1 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry1.addPhoneNumber(new PhoneNumber("111-111-1111"));
        entry1.addPhoneNumber(new PhoneNumber("333-333-3333"));

        entry2 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry2.addPhoneNumber(new PhoneNumber("111-111-1111"));
        entry2.addPhoneNumber(new PhoneNumber("222-222-2222"));
        entry2.addPhoneNumber(new PhoneNumber("333-333-3333"));

        // entry1 is missing one of entry2's phone numbers, so they're not equal
        System.out.println("case 3: " + entry1.equals(entry2)); // expected: false

        // -------------------------- test case 4 --------------------------

        entry1 = new PhonebookEntry(new Name("John", "Doe"));
        entry1.addPhoneNumber(new PhoneNumber("111-111-1111"));

        entry2 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry2.addPhoneNumber(new PhoneNumber("111-111-1111"));

        // entry1 and entry2 have unequal names, so they are not equal
        System.out.println("case 4: " + entry1.equals(entry2)); // expected: false

        // -------------------------- test case 5 --------------------------

        entry1 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry1.addPhoneNumber(new PhoneNumber("111-111-1111"));

        entry2 = new PhonebookEntry(new Name("Jane", "Doe"));

        System.out.println("case 5: " + entry1.equals(entry2)); // expected: false

        // -------------------------- test case 6 --------------------------

        entry1 = new PhonebookEntry(new Name("Jane", "Doe"));

        entry2 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry2.addPhoneNumber(new PhoneNumber("111-111-1111"));

        System.out.println("case 6: " + entry1.equals(entry2)); // expected: false

        // -------------------------- test case 7 --------------------------

        entry1 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry1.addPhoneNumber(new PhoneNumber("111-111-1111"));
        entry1.addPhoneNumber(new PhoneNumber("222-222-2222"));
        entry1.addPhoneNumber(new PhoneNumber("333-333-3333"));

        // entry1 is equal to itself
        System.out.println("case 7: " + entry1.equals(entry1)); // expected: true

        // -------------------------- test case 8 --------------------------

        entry1 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry1.addPhoneNumber(new PhoneNumber("111-111-1111"));
        entry1.addPhoneNumber(new PhoneNumber("222-222-2222"));

        entry2 = new PhonebookEntry(new Name("Jane", "Doe"));
        entry2.addPhoneNumber(new PhoneNumber("111-111-1111"));
        entry2.addPhoneNumber(new PhoneNumber("333-333-3333"));

        System.out.println("case 8: " + entry1.equals(entry2)); // expected: false

        // -------------------------- other tests --------------------------

        System.out.println(entry1.equals(null));       // expected: false
        System.out.println(entry1.equals("a String")); // expected: false

        System.out.println();
    }

    private static void testToString() {
        System.out.println("testing toString");

        PhonebookEntry phonebookEntry = new PhonebookEntry(new Name("Jane", "Doe"));
        System.out.println(phonebookEntry); // expected: Jane Doe: []

        phonebookEntry.addPhoneNumber(new PhoneNumber("111-111-1111"));
        System.out.println(phonebookEntry); // expected: Jane Doe: [111-111-1111]

        phonebookEntry.addPhoneNumber(new PhoneNumber("222-222-2222"));
        System.out.println(phonebookEntry); // expected: Jane Doe: [111-111-1111, 222-222-2222]

        phonebookEntry.addPhoneNumber(new PhoneNumber("333-333-3333"));
        System.out.println(phonebookEntry); // expected: Jane Doe: [111-111-1111, 222-222-2222, 333-333-3333]

        phonebookEntry.deletePhoneNumber(new PhoneNumber("222-222-2222"));
        System.out.println(phonebookEntry); // expected: Jane Doe: [111-111-1111, 333-333-3333]

        System.out.println();
    }

    private static void testToCsvString() {
        System.out.println("testing toCsvString");

        PhonebookEntry phonebookEntry = new PhonebookEntry(new Name("Jane", "Doe"));
        System.out.println(phonebookEntry.toCsvString()); // expected: Jane Doe

        phonebookEntry.addPhoneNumber(new PhoneNumber("111-111-1111"));
        System.out.println(phonebookEntry.toCsvString()); // expected: Jane Doe,111-111-1111

        phonebookEntry.addPhoneNumber(new PhoneNumber("222-222-2222"));
        System.out.println(phonebookEntry.toCsvString()); // expected: Jane Doe,111-111-1111,222-222-2222

        phonebookEntry.addPhoneNumber(new PhoneNumber("333-333-3333"));
        System.out.println(phonebookEntry.toCsvString()); // expected: Jane Doe,111-111-1111,222-222-2222,333-333-3333

        phonebookEntry.deletePhoneNumber(new PhoneNumber("222-222-2222"));
        System.out.println(phonebookEntry.toCsvString()); // expected: Jane Doe,111-111-1111,333-333-3333

        System.out.println();
    }
}
