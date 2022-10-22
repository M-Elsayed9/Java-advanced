// DO NOT MODIFY THIS FILE.

public class TestBankAccount {
    public static void main(String[] args) {
        testGetTotal();
        testGetAndSetInterestRate();
        testGetInterestAmount();
    }

    private static void testGetTotal() {
        System.out.println("testing getTotal");
        System.out.println(BankAccount.getTotal().toString()); // expected: $0.00
        BankAccount account1 = new BankAccount(new Name("John", "Doe"), 456789, new MonetaryValue(100.00));
        System.out.println(BankAccount.getTotal().toString()); // expected: $100.00
        BankAccount account2 = new BankAccount(new Name("John", "Doe"), 456789, new MonetaryValue(50.00));
        System.out.println(BankAccount.getTotal().toString()); // expected: $150.00
        BankAccount account3 = new BankAccount(new Name("John", "Doe"));
        System.out.println(BankAccount.getTotal().toString()); // expected: $150.00
        BankAccount account4 = new BankAccount(new Name("John", "Doe"), 456782);
        System.out.println(BankAccount.getTotal().toString()); // expected: $150.00
        BankAccount copy = new BankAccount(account2);
        System.out.println(BankAccount.getTotal().toString()); // expected: $200.00
        account1.deposit(new MonetaryValue(50.00));
        System.out.println(BankAccount.getTotal().toString()); // expected: $250.00
        account2.deposit(new MonetaryValue(50.00));
        System.out.println(BankAccount.getTotal().toString()); // expected: $300.00
        account1.withdraw(new MonetaryValue(25.00));
        System.out.println(BankAccount.getTotal().toString()); // expected: $275.00
        account2.withdraw(new MonetaryValue(25.00));
        System.out.println(BankAccount.getTotal().toString()); // expected: $250.00
        System.out.println();
    }

    private static void testGetAndSetInterestRate() {
        System.out.println("testing getInterestRate and setInterestRate");
        System.out.println(BankAccount.getInterestRate()); // expected: 0.0
        BankAccount.setInterestRate(3.5);
        System.out.println(BankAccount.getInterestRate()); // expected: 3.5
        BankAccount.setInterestRate(-0.5);
        System.out.println(BankAccount.getInterestRate()); // expected: 3.5
        BankAccount.setInterestRate(0.5);
        System.out.println(BankAccount.getInterestRate()); // expected: 0.5
        System.out.println();
    }

    private static void testGetInterestAmount() {
        System.out.println("testing getInterestAmount");
        BankAccount.setInterestRate(1.0);
        BankAccount account = new BankAccount(new Name("John", "Doe"), 456789, new MonetaryValue(100.00));
        System.out.println(account.getInterestAmount().toString()); // expected: $1.00
        BankAccount.setInterestRate(2.5);
        System.out.println(account.getInterestAmount().toString()); // expected: $2.50
        account = new BankAccount(new Name("John", "Doe"), 456789, new MonetaryValue(1000.00));
        System.out.println(account.getInterestAmount().toString()); // expected: $25.00
        System.out.println();
    }
}
