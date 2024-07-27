package entitiesAccount;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInteresRate() {
		return interestRate;
	}

	public void setInteresRate(Double interesRate) {
		this.interestRate = interesRate;
	}
	
	public void upDateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
