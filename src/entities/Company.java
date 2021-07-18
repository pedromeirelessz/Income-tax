package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

//-------------------------------------------------------------------------------------------------

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

//-------------------------------------------------------------------------------------------------

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

//-------------------------------------------------------------------------------------------------

	@Override
	public double tax() {

		double incomeTax = 0.0;

		if (numberOfEmployees > 10) {

			incomeTax = (getAnualIncome() * 14) / 100;

		} else {

			incomeTax = (getAnualIncome() * 16) / 100;
		}

		if (incomeTax < 0.0) {
			incomeTax = 0.0;
		}

		return incomeTax;

	}

}
