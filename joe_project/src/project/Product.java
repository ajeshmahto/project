package project;

public class Product {
	
	private int productNumber;	
	private double price;
	private String description;	
	private Stock stock;
	
	


	public Product(int productNumber,  double price,
			String description, String productType) {
		super();
		this.productNumber = productNumber;		
		this.price = price;
		this.description = description;
		
	}



	
	

	public double getPrice() {
		
		return price;
	}

}
