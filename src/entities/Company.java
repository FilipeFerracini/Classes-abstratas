package entities;

public class Company extends Person {

	private Integer numberEmployees;

	public Company() {
	}

	public Company(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
		if (numberEmployees <= 10)
			return getAnnualIncome() * 0.16;
		else
			return getAnnualIncome() * 0.14;
	}

}
