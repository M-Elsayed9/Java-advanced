package inheritance;

class CheckingAccount extends BankAccount {

	private MonetaryValue draftLimit = new MonetaryValue();
	
	public CheckingAccount(String accountNumber, MonetaryValue balance, MonetaryValue draftLimit) {
		super(accountNumber, balance);
		this.draftLimit = draftLimit;
	}
	
	public MonetaryValue getOverdraftLimit() {
		return this.draftLimit;
	}
	
	@Override
	protected boolean withdrawalNotAllowed(MonetaryValue amount) {
        return amount.isNegative() || amount.isGreaterThan(balance.plus(draftLimit));
    }
}
