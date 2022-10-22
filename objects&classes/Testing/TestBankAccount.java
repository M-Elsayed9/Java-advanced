public class TestBankAccount {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(new Name("Jane", "Doe"), 4567890, new MonetaryValue(100.00));
    account.deposit(new MonetaryValue(300.00));
    System.out.println(account.getBalance().toString()); // $400.00
    account.withdraw(new MonetaryValue(500.00));
    account.withdraw(new MonetaryValue(150.00));
    System.out.println(account.toCsvString());
  }
}