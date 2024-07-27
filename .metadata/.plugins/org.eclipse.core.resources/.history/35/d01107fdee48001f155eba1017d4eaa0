package entities;

public class Individual extends Servidor {

	private Double healthExpenditure;

	public Individual() {
		super();
	}

	public Individual(String name, Double income, Double healthExpenditure) {
		super(name, income);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public Double tax() {
		double tax = 0;
		if (getIncome() < 20000.00) {
			tax = (getIncome() * 15 / 100) - (healthExpenditure * 50 / 100);
		} else if (getIncome() > 20000.00) {
			tax = (getIncome() * 25 / 100) - (healthExpenditure * 50 / 100);
		}
		return tax;
	}

}
