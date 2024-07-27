package entitiesProduct;

public class employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public employee() {
	}
	public employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getIde() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	@Override
	public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}
