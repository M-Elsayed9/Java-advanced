/*
 * DO NOT MODIFY THIS FILE. You may copy it and modify its code outside of Codelab, but do not paste the modified code on Codelab.
 * Files that do not have this notice may be modified.
 */

public class TestPhoneNumber {
    public static void main(String[] args) {
        testStringConstructor();
        testIntsConstructor();
        testCopyConstructor();
        testGetAreaCode();
        testGetPrefix();
        testGetLineNumber();
        testToString();
        testIsEqualTo();
    }

    private static void testStringConstructor() {
        System.out.println("testing constructor that takes a String");
        PhoneNumber phoneNumber = new PhoneNumber("455-678-3456");
        System.out.println();
    }

    private static void testIntsConstructor() {
        System.out.println("testing constructor that takes three ints");
        PhoneNumber phoneNumber = new PhoneNumber(455, 678, 3456);
        System.out.println();
    }

    private static void testCopyConstructor() {
        System.out.println("testing copy constructor");
        PhoneNumber original = new PhoneNumber("455-678-3456");
        PhoneNumber copy = new PhoneNumber(original);
        System.out.println(original.getAreaCode() == copy.getAreaCode());     // expected: true
        System.out.println(original.getPrefix() == copy.getPrefix());         // expected: true
        System.out.println(original.getLineNumber() == copy.getLineNumber()); // expected: true
        System.out.println(original.toString().equals(copy.toString()));      // expected: true
        System.out.println();
    }

    private static void testGetAreaCode() {
        System.out.println("testing getAreaCode");

        // testing using the constructor that takes three ints
        System.out.println(new PhoneNumber(450, 678, 3456).getAreaCode()); // expected: 450
        System.out.println(new PhoneNumber(50, 678, 3456).getAreaCode()); // expected: 50
        System.out.println(new PhoneNumber(5, 678, 3456).getAreaCode()); // expected: 5
        System.out.println(new PhoneNumber(0, 678, 3456).getAreaCode()); // expected: 0

        // testing using the constructor that takes a String
        System.out.println(new PhoneNumber("450-678-3456").getAreaCode()); // expected: 450
        System.out.println(new PhoneNumber("050-678-3456").getAreaCode()); // expected: 50
        System.out.println(new PhoneNumber("005-678-3456").getAreaCode()); // expected: 5
        System.out.println(new PhoneNumber("000-678-3456").getAreaCode()); // expected: 0

        System.out.println();
    }

    private static void testGetPrefix() {
        System.out.println("testing getPrefix");

        // testing using the constructor that takes three ints
        System.out.println(new PhoneNumber(455, 670, 3456).getPrefix()); // expected: 670
        System.out.println(new PhoneNumber(455, 70, 3456).getPrefix()); // expected: 70
        System.out.println(new PhoneNumber(455, 7, 3456).getPrefix()); // expected: 7
        System.out.println(new PhoneNumber(455, 0, 3456).getPrefix()); // expected: 0

        // testing using the constructor that takes a String
        System.out.println(new PhoneNumber("455-670-3456").getPrefix()); // expected: 670
        System.out.println(new PhoneNumber("455-070-3456").getPrefix()); // expected: 70
        System.out.println(new PhoneNumber("455-007-3456").getPrefix()); // expected: 7
        System.out.println(new PhoneNumber("455-000-3456").getPrefix()); // expected: 0

        System.out.println();
    }

    private static void testGetLineNumber() {
        System.out.println("testing getLineNumber");

        // testing using the constructor that takes three ints
        System.out.println(new PhoneNumber(455, 678, 3450).getLineNumber()); // expected: 3450
        System.out.println(new PhoneNumber(455, 678, 450).getLineNumber()); // expected: 450
        System.out.println(new PhoneNumber(455, 678, 50).getLineNumber()); // expected: 50
        System.out.println(new PhoneNumber(455, 678, 5).getLineNumber()); // expected: 5
        System.out.println(new PhoneNumber(455, 678, 0).getLineNumber()); // expected: 0

        // testing using the constructor that takes a String
        System.out.println(new PhoneNumber("455-678-3450").getLineNumber()); // expected: 3450
        System.out.println(new PhoneNumber("455-678-0450").getLineNumber()); // expected: 450
        System.out.println(new PhoneNumber("455-678-0050").getLineNumber()); // expected: 50
        System.out.println(new PhoneNumber("455-678-0005").getLineNumber()); // expected: 5
        System.out.println(new PhoneNumber("455-678-0000").getLineNumber()); // expected: 0

        System.out.println();
    }

    private static void testToString() {
        System.out.println("testing toString");

        System.out.println(new PhoneNumber("450-678-3456").toString()); // expected: 450-678-3456
        System.out.println(new PhoneNumber("050-678-3456").toString()); // expected: 050-678-3456
        System.out.println(new PhoneNumber("005-678-3456").toString()); // expected: 005-678-3456
        System.out.println(new PhoneNumber("000-678-3456").toString()); // expected: 000-678-3456
        System.out.println();

        System.out.println(new PhoneNumber("455-670-3456").toString()); // expected: 455-670-3456
        System.out.println(new PhoneNumber("455-070-3456").toString()); // expected: 455-070-3456
        System.out.println(new PhoneNumber("455-007-3456").toString()); // expected: 455-007-3456
        System.out.println(new PhoneNumber("455-000-3456").toString()); // expected: 455-000-3456
        System.out.println();

        System.out.println(new PhoneNumber("455-678-3450").toString()); // expected: 455-678-3450
        System.out.println(new PhoneNumber("455-678-0450").toString()); // expected: 455-678-0450
        System.out.println(new PhoneNumber("455-678-0050").toString()); // expected: 455-678-0050
        System.out.println(new PhoneNumber("455-678-0005").toString()); // expected: 455-678-0005
        System.out.println(new PhoneNumber("455-678-0000").toString()); // expected: 455-678-0000
        System.out.println();

        System.out.println(new PhoneNumber(450, 678, 3456).toString()); // expected: 450-678-3456
        System.out.println(new PhoneNumber(50, 678, 3456).toString());  // expected: 050-678-3456
        System.out.println(new PhoneNumber(5, 678, 3456).toString());   // expected: 005-678-3456
        System.out.println(new PhoneNumber(0, 678, 3456).toString());   // expected: 000-678-3456
        System.out.println();

        System.out.println(new PhoneNumber(455, 670, 3456).toString()); // expected: 455-670-3456
        System.out.println(new PhoneNumber(455, 70, 3456).toString());  // expected: 455-070-3456
        System.out.println(new PhoneNumber(455, 7, 3456).toString());   // expected: 455-007-3456
        System.out.println(new PhoneNumber(455, 0, 3456).toString());   // expected: 455-000-3456
        System.out.println();

        System.out.println(new PhoneNumber(455, 678, 3450).toString()); // expected: 455-678-3450
        System.out.println(new PhoneNumber(455, 678, 450).toString());  // expected: 455-678-0450
        System.out.println(new PhoneNumber(455, 678, 50).toString());   // expected: 455-678-0050
        System.out.println(new PhoneNumber(455, 678, 5).toString());    // expected: 455-678-0005
        System.out.println(new PhoneNumber(455, 678, 0).toString());    // expected: 455-678-0000
        System.out.println();
    }

    private static void testIsEqualTo() {
        System.out.println("testing isEqualTo");

        // testing using the constructor that takes a String
        System.out.println(new PhoneNumber("123-456-7890").isEqualTo(new PhoneNumber("123-456-7890"))); // expected: true
        System.out.println(new PhoneNumber("123-426-7890").isEqualTo(new PhoneNumber("123-456-7890"))); // expected: false

        // testing using the constructor that takes three ints
        System.out.println(new PhoneNumber(123, 456, 7890).isEqualTo(new PhoneNumber(123, 456, 7890))); // expected: true
        System.out.println(new PhoneNumber(123, 426, 7890).isEqualTo(new PhoneNumber(123, 456, 7890))); // expected: false

        // testing using a mixture of two constructors
        System.out.println(new PhoneNumber(123, 456, 7890).isEqualTo(new PhoneNumber("123-456-7890"))); // expected: true
        System.out.println(new PhoneNumber("123-456-7890").isEqualTo(new PhoneNumber(123, 456, 7890))); // expected: true

        // test using two pointers to a single object
        PhoneNumber phoneNumber = new PhoneNumber("123-456-7890");
        System.out.println(phoneNumber.isEqualTo(phoneNumber)); // expected: true
    }
}
