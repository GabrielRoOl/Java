package entities;

public class Juridica extends Servidor {

	private Integer employee;

	public Juridica() {
		super();
	}

	public Juridica(String name, Double income, Integer employee) {
		super(name, income);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public Double tax() {
		double tax = 0;
		if(getEmployee() > 10) {
			tax = getIncome() * 14 / 100;
		}
		else {
			tax = getIncome() * 16 / 100;
		}
		return tax;
	}

}
