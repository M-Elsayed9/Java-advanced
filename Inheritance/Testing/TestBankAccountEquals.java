package inheritance;

//DO NOT MODIFY THIS FILE.

public class TestBankAccountEquals {
 public static void main(String[] args) {
     Object ba1 = new BankAccount("123456", new MonetaryValue(456));
     Object ba2 = new BankAccount("123456", new MonetaryValue(456));
     Object ba3 = new BankAccount("987654", new MonetaryValue(456));
     Object ba4 = new BankAccount("123456", new MonetaryValue(987));

     System.out.println(ba1.equals(ba2)); // expected: true
     System.out.println(ba1.equals(ba3)); // expected: false
     System.out.println(ba1.equals(ba4)); // expected: false
     System.out.println(ba1.equals("a string")); // expected: false
     System.out.println(ba1.equals(null)); // expected: false
 }
}
