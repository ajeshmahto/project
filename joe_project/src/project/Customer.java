package project;

public  class Customer {
	
	private String name;
	private String address;	
	private String creditType;
	private int point;
	
	public Customer(String name, String address, 
			String creditType,  int point) {
		super();
		this.name = name;
		this.address = address;				
		this.creditType = creditType;
		this.point = point;
	}
	
	
	public String getName()
	{
		return name;
	}


	public String getCreditType() {
		return creditType;
	}


	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point+=point;
	}
	
	public void setPointZero()
	{
		this.point=0;
	}
	

}
