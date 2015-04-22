package project;

import java.util.Date;

public class Product {
	
	private int productNumber;	
	private double price;
	private String description;	
	private int stock;
	private Date shipmentDate;
	
	
	
	public Product(int productNumber,  double price,
			String description,int stock) {
		super();
		this.productNumber = productNumber;		
		this.price = price;
		this.description = description;
		this.stock=stock;
		
	}


   public int getStock()
   {
	   return stock;
   }
   
   
   public void deductStock(int quantity)
   {
	   if(stock>=quantity)
	   stock-=quantity;
	   else
		   stock=0;
   }

	public double getPrice() {
		
		return price;
	}
	
	public Date getShipmentDate() {
		return shipmentDate;
	}


	public void setShipmentDateOfCurrentStock(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
		
	}
	
	


}
