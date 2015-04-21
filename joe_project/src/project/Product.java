package project;

public class Product {
	
	private int productNumber;
	private int stock;
	private double price;
	private String description;
	private String ProductType;
	
	
	


	public Product(int productNumber, int stock, double price,
			String description, String productType) {
		super();
		this.productNumber = productNumber;
		this.stock = stock;
		this.price = price;
		this.description = description;
		ProductType = productType;
	}



	public int getStock()
	{
		return stock;
	}
	
	public void deductStock(int quantity)
	{
		stock-=quantity;
	}


	public double getPrice() {
		
		return price;
	}

}
