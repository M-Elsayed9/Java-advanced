public class TestBank {
  public static void main(String[] args) {
    Bank bank = new Bank();
    BankAccount account1 
      = new BankAccount(new Name("Jane", "Doe"), 4567890, new MonetaryValue(100.00));
    bank.addAccount(account1);
    BankAccount account2 
      = new BankAccount(new Name("John", "Doe"), 123456, new MonetaryValue(200.00));
    bank.addAccount(account2);
    System.out.println(bank.getBalance(123456).toString()); // $200.00
    MonetaryValue result = bank.getBalance(100000);
    if (result == null) {
      System.out.println("account number doesn't exist");
    } else {
      System.out.println("balance is " + result.toString());
    }

    System.out.println(bank.contains(100000)); // false
    System.out.println(bank.contains(123456)); // true

    bank.withdraw(123456, new MonetaryValue(50.00));

    bank.addAccount(new Name("John", "Doe"), 787878, new MonetaryValue(67.00));

    System.out.println(bank.getAccountNumberWithHighestBalance());
  }
}