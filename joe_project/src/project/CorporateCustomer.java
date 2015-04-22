package project;

public class CorporateCustomer extends Customer {
	
	private double creditLimit;
	
	
	
	public CorporateCustomer(String name, String address,
			String creditType, double creditLimit, int point) {
		super(name, address, creditType, point);
		this.creditLimit=creditLimit;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	
	
}
