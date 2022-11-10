package inheritance;



	// DO NOT MODIFY THIS FILE.

	public class TestCheckingAccount {
	    public static void main(String[] args) {
	        testExtendsBankAccount();
	        testField();
	        testConstructor();
	        testWithdraw();
	    }

	    private static void testExtendsBankAccount() {
	        System.out.println("testing extends BankAccount");

	        CheckingAccount ca = new CheckingAccount("123456", new MonetaryValue(100.00), new MonetaryValue(100.00));
	        System.out.println(ca instanceof BankAccount); // expected: true

	        System.out.println();
	    }

	    // This method tests that the CheckingAccount class has only one declared field, and that the field is a MonetaryValue. 
	    // You do not have to understand how this method works. (It uses a Java feature called "reflection.")
	    private static void testField() {
	        System.out.println("testing field");

	        java.lang.reflect.Field[] fields = CheckingAccount.class.getDeclaredFields();
	        System.out.println(fields.length); // expected: 1
	        System.out.println(fields[0].getType().getName()); // expected: MonetaryValue

	        System.out.println();
	    }

	    private static void testConstructor() {
	        System.out.println("testing constructor");

	        CheckingAccount ca = new CheckingAccount("123456", new MonetaryValue(100.00), new MonetaryValue(50.00));
	        System.out.println(ca.getAccountNumber());  // expected: 123456
	        System.out.println(ca.getBalance());        // expected: $100.00
	        System.out.println(ca.getOverdraftLimit()); // expected: $50.00

	        System.out.println();
	    }

	    private static void testWithdraw() {
	        System.out.println("testing withdraw");

	        CheckingAccount ca = new CheckingAccount("123456", new MonetaryValue(100.00), new MonetaryValue(100.00));

	        boolean result = ca.withdraw(new MonetaryValue(150.00));
	        System.out.println(result);  // expected: true
	        System.out.println(ca.getBalance()); // expected: $-50.00

	        result = ca.withdraw(new MonetaryValue(100.00));
	        System.out.println(result);  // expected: false
	        System.out.println(ca.getBalance()); // expected: $-50.00

	        result = ca.withdraw(new MonetaryValue(50.00));
	        System.out.println(result);  // expected: true
	        System.out.println(ca.getBalance()); // expected: $-100.00

	        result = ca.withdraw(new MonetaryValue(50.00));
	        System.out.println(result);  // expected: false
	        System.out.println(ca.getBalance()); // expected: $-100.00

	        ca.deposit(new MonetaryValue(200.00));
	        System.out.println(ca.getBalance()); // expected: $100.00
	        result = ca.withdraw(new MonetaryValue(150.00));
	        System.out.println(result); // expected: true
	        System.out.println(ca.getBalance());  // expected: $-50.00

	        System.out.println();
	    }
	}
