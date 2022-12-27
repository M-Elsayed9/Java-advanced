// DO NOT MODIFY THIS FILE.

public class TestPhoneNumberEquals {
    public static void main(String[] args) {
        System.out.println(new PhoneNumber("111-111-1111").equals(new PhoneNumber("111-111-1111"))); // expected: true
        System.out.println(new PhoneNumber("111-111-1111").equals(new PhoneNumber("222-111-1111"))); // expected: false
        System.out.println(new PhoneNumber("111-111-1111").equals(new PhoneNumber("111-222-1111"))); // expected: false
        System.out.println(new PhoneNumber("111-111-1111").equals(new PhoneNumber("111-111-2222"))); // expected: false

        // test using two references to a single object
        PhoneNumber phoneNumber = new PhoneNumber("111-111-1111");
        System.out.println(phoneNumber.equals(phoneNumber)); // expected: true

        System.out.println(phoneNumber.equals("123-456-7890")); // expected: false
        System.out.println(phoneNumber.equals(null)); // expected: false
    }
}
