package inheritance;
//DO NOT MODIFY THIS FILE.

import java.time.LocalDate;
import java.time.Period;

public class TestCDAccount {
 public static void main(String[] args) {
     testExtendsBankAccount();
     testConstructorAndGetTermEnd();
     testWithdrawal();
 }

 private static void testExtendsBankAccount() {
     System.out.println("testing extends BankAccount");

     CDAccount account = new CDAccount("123456", new MonetaryValue(150.00),
             LocalDate.parse("2022-03-15"), Period.ofMonths(6));
     System.out.println(account instanceof BankAccount); // expected: true

     System.out.println();
 }

 private static void testConstructorAndGetTermEnd() {
     System.out.println("testing constructor and getTermEnd");

     CDAccount account = new CDAccount("123456", new MonetaryValue(150.00),
             LocalDate.parse("2022-03-15"), Period.ofMonths(6));
     System.out.println(account.getAccountNumber()); // expected: 123456
     System.out.println(account.getBalance());       // expected: $150.00
     System.out.println(account.getTermEnd());       // expected: 2022-09-15

     account = new CDAccount("987654", new MonetaryValue(150.00),
             LocalDate.parse("2022-04-01"), Period.ofMonths(3));
     System.out.println(account.getAccountNumber()); // expected: 987654
     System.out.println(account.getBalance());       // expected: $150.00
     System.out.println(account.getTermEnd());       // expected: 2022-07-01

     System.out.println();
 }

 private static void testWithdrawal() {
     CDAccount account = new CDAccount("123456", new MonetaryValue(150.00),
             LocalDate.parse("2022-09-15"), Period.ofMonths(6));

     // attempt to withdraw from account in middle of term
     boolean result = account.withdraw(new MonetaryValue(50.00));
     System.out.println(result);               // expected: false
     System.out.println(account.getBalance()); // expected: $150.00

     account = new CDAccount("987654", new MonetaryValue(150.00),
             LocalDate.parse("2022-04-01"), Period.ofMonths(3));

     // withdraw from account whose term has completed
     result = account.withdraw(new MonetaryValue(50.00));
     System.out.println(result);               // expected: true
     System.out.println(account.getBalance()); // expected: $100.00

     // attempt to withdraw a negative amount
     result = account.withdraw(new MonetaryValue(-25.00));
     System.out.println(result);               // expected: false
     System.out.println(account.getBalance()); // expected: $100.00

     // attempt to make the balance go below $0.00
     result = account.withdraw(new MonetaryValue(150.00));
     System.out.println(result);               // expected: false
     System.out.println(account.getBalance()); // expected: $100.00

 }
}
