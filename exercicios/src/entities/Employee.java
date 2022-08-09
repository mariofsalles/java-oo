package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentual) {
		salary += salary * percentual / 100;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
