/*
 * DO NOT MODIFY THIS FILE. You may copy it and modify its code outside of Codelab, but do not paste the modified code on Codelab.
 * Files that do not have this notice may be modified.
 */

public class TestPhonebookEntry {
    public static void main(String[] args) {
        testConstructor();
        testCopyConstructor();
        testSetName();
        testSetPhoneNumber();
        testToString();
        testToCsvString();
        testIsEqualTo();
    }

    private static void testConstructor() {
        System.out.println("testing constructor");
        PhonebookEntry phonebookEntry = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-456-7890"));
        System.out.println(phonebookEntry.getName().toString()); // expected: Jane Doe
        System.out.println(phonebookEntry.getPhoneNumber().toString()); // expected: 123-456-7890
        System.out.println();
    }

    private static void testCopyConstructor() {
        System.out.println("testing copy constructor");

        PhonebookEntry original = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-456-7890"));
        PhonebookEntry copy = new PhonebookEntry(original);

        original.getName().setFirst("Julia");
        System.out.println(original.getName().getFirst()); // expected: Julia
        System.out.println(copy.getName().getFirst()); // expected: Jane

        copy.getName().setLast("Smith");
        System.out.println(original.getName().getLast()); // expected: Doe
        System.out.println(copy.getName().getLast()); // expected: Smith

        System.out.println();
    }

    private static void testSetName() {
        System.out.println("testing setName");
        PhonebookEntry phonebookEntry = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-456-7890"));
        System.out.println(phonebookEntry.getName().toString()); // expected: Jane Doe
        phonebookEntry.setName(new Name("John", "Smith"));
        System.out.println(phonebookEntry.getName().toString()); // expected: John Smith
        System.out.println();
    }

    private static void testSetPhoneNumber() {
        System.out.println("testing setPhoneNumber");
        PhonebookEntry phonebookEntry = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-456-7890"));
        System.out.println(phonebookEntry.getPhoneNumber().toString()); // expected: 123-456-7890
        phonebookEntry.setPhoneNumber(new PhoneNumber("678-901-2345"));
        System.out.println(phonebookEntry.getPhoneNumber().toString()); // expected: 678-901-2345
        System.out.println();
    }

    private static void testToString() {
        System.out.println("testing toString");
        PhonebookEntry phonebookEntry = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-456-7890"));
        System.out.println(phonebookEntry.toString()); // expected: Jane Doe: 123-456-7890
        System.out.println();
    }

    private static void testToCsvString() {
        System.out.println("testing toCsvString");
        PhonebookEntry phonebookEntry = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-456-7890"));
        System.out.println(phonebookEntry.toCsvString()); // expected: Jane Doe,123-456-7890
        System.out.println();
    }

    private static void testIsEqualTo() {
        System.out.println("testing isEqualTo");

        PhonebookEntry entry1 = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-456-7890"));
        PhonebookEntry entry2 = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-456-7890"));
        PhonebookEntry entry3 = new PhonebookEntry(new Name("Julia", "Doe"), new PhoneNumber("123-456-7890"));
        PhonebookEntry entry4 = new PhonebookEntry(new Name("Jane", "Doe"), new PhoneNumber("123-444-7890"));
        System.out.println(entry1.isEqualTo(entry1)); // expected: true
        System.out.println(entry1.isEqualTo(entry2)); // expected: true
        System.out.println(entry1.isEqualTo(entry3)); // expected: false
        System.out.println(entry1.isEqualTo(entry4)); // expected: false

        System.out.println();
    }
}
