package entities;

public class Individual extends Person {

	private Double healthExpenses;

	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double tax() {
		if (getAnnualIncome() < 20000.0)
			return 0.15 * getAnnualIncome();
		else
			return 0.25 * getAnnualIncome() - healthExpenses * 0.50;
	}

}
