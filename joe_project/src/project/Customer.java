package project;

public  class Customer {
	
	private String name;
	private String address;
	private String type;	
	private String creditType;
	private int point;
	
	public Customer(String name, String address, String type,
			String creditType,  int point) {
		super();
		this.name = name;
		this.address = address;
		this.type = type;		
		this.creditType = creditType;
		this.point = point;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	

}
