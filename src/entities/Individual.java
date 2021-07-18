package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

//-------------------------------------------------------------------------------------------------

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

//-------------------------------------------------------------------------------------------------

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

//-------------------------------------------------------------------------------------------------

	@Override
	public double tax() {

		double sum = healthExpenditures / 2;

		double incomeTax = 0.0;

		if (getAnualIncome() > 20000.00) {

			incomeTax = (getAnualIncome() * 25) / 100;
			incomeTax -= sum;

		} else {

			incomeTax = (getAnualIncome() * 15) / 100;
			incomeTax -= sum;
		}

		if (incomeTax < 0.0) {
			incomeTax = 0.0;
		}

		return incomeTax;
	} 

}
