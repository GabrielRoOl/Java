package entitiesProduct;

public class bankData {
	private int bankAccount;
	private String titleHolder;
	private double deposit;
	
	public bankData(int bankAccount, String titleHolder, double initialdeposit) {
		this.bankAccount = bankAccount;
		this.titleHolder = titleHolder;
		deposit(initialdeposit);
	}
	
	public bankData(int bankAccount, String titleHolder) {
		this.bankAccount = bankAccount;
		this.titleHolder = titleHolder;
	}
	

	public int getBankAccont() {
		return bankAccount;
	
	}
	public String getTitleHolder() {
		return titleHolder;
	}

	public double getDeposit() {
		return deposit;
	}
	
	public void setTitleHolder(String titleHolder) {
		this.titleHolder = titleHolder;
	}
	
	public void deposit(double deposit) {
		this.deposit += deposit;
	}
	public void withDraw(double deposit) {
		this.deposit -= deposit + 5;
	}
	
	public String toString() {
		return bankAccount + ", Holder: " + titleHolder + ", Balance: $ " + String.format("%.2f", deposit) ;
	}
}
