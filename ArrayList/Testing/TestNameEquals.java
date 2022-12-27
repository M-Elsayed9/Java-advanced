// DO NOT MODIFY THIS FILE.

public class TestNameEquals {
    public static void main(String[] args) {
        System.out.println(new Name("Jane", "Doe").equals(new Name("Jane", "Doe"))); // expected: true
        System.out.println(new Name("Jane", "Doe").equals(new Name("John", "Doe"))); // expected: false
        System.out.println(new Name("Jane", "Doe").equals(new Name("Jane", "Lei"))); // expected: false
        System.out.println(new Name("Jane", "Doe").equals(new Name("Doe", "Jane"))); // expected: false
        System.out.println(new Name("Jane", "Doe").equals("a string"));              // expected: false
        System.out.println(new Name("Jane", "Doe").equals(null));                    // expected: false
    }
}