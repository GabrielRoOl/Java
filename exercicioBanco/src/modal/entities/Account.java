package modal.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withDraw(Double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(double amount) {
		if (withDrawLimit < amount) {
			throw new IllegalArgumentException("The amount exceeds withdraw limit.");
		}
		if (balance < amount) {
			throw new IllegalArgumentException("Not enough balance.");
		}
	}
	
}
