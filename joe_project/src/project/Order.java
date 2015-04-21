package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private String status;
	private Date shippedDate;
	private Date orderDate;
	private double totalOrderPrice;
	private String paymentType;
	private Customer customer;
	
	private List<Product> products = new ArrayList<Product>();
	
	
//	public Order(String status, Date shippedDate,
//			String paymentType, Customer customer,List<Product> products) {
//		super();
//		this.status = status;
//		this.shippedDate = shippedDate;
//		this.paymentType = paymentType;
//		this.customer = customer;
//		this.products=products;
//	}
	
	public Order(Date orderDate, Customer customer)
	{
	    this.orderDate=orderDate;
	    this.customer=customer;
	}
	
	
	public void addToCart(Product product, int quantity)
	{
		if(product.getStock()>=quantity)	
		products.add(product);
		product.setStock(quantity);	
		
	}
	
	public double totalPrice()
	{
		double sum=0.0;
		for(Product p: products){
			sum+=p.getPrice();
		}
		
		return sum;
	}
	
	
	
	

}
