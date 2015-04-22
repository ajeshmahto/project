package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderTrackingSystem {
	
	Input input = new Input();
	int seletedMenu;
	Customer customer;
	Date todayDate =new Date();
	Order order;
	Payment payment;
	List<Product> products = new ArrayList<Product>();
	
	 Product[] productSelected = new Product[2];
	 
	 public OrderTrackingSystem()
	 {
		 productSelected[0]= new ComputerProducts(100,200,"mouse",5);
		 productSelected[1]= new HealthRelatedProduct(101,200,"brufen",10);
		
	 }
	 
	
	boolean selected=false;
	
	public void run()
	{
		 
		 
		while(true)
		{
			while(!selected)
			{
				System.out.println("Choose Customer.\n 1.Corporate Customer \n 2.Personal Customer");
				seletedMenu = input.selected();
				
				switch(seletedMenu)
				{
				   case 1:
					   customer= new CorporateCustomer("ajesh","usa","excellent",5000.00,0);
					   selected = true;
					   break;
				   case 2:
					   customer= new PersonalCustomer("ajesh","usa","poor",0);
					   selected=true;
					   break;
				   default:	   
					   System.out.println("Your input is incorrect. Please try again!");
				}
				
				// order = new Order("shipped",today,"prepaid",customer,products); //String status, Date shippedDate,String paymentType, Customer customer
				
				order = new Order(todayDate,customer);
				order.addToCart(productSelected[0], 5);
				order.addToCart(productSelected[1], 3);
				 
				 
				 System.out.println("Show Monthly Report:");
					
					
					
					String leftAlignFormat = "| %-15s | %-12d | %-12s|%n";

					System.out.format("+-----------------+--------------+-------------+%n");
					System.out.printf("| CustomerName    | CreditLimit  | Order       |%n");
					System.out.format("+-----------------+--------------+------------+%n");
					
					    System.out.format(leftAlignFormat, customer.getName(), 0, "Order1");
					
					System.out.format("+-----------------+----------------------------+%n");
					
			}
			
			//display main menu after customer defined
			
			
			
			
			
			
		}
	}

}
