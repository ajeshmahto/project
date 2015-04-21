package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderTrackingSystem {
	
	Input input = new Input();
	int seletedMenu;
	Customer customer;
	Date today =new Date();
	 Order order;
	List<Product> products = new ArrayList<Product>();
	
	 Product[] productSelected = new Product[2];
	 
	 public OrderTrackingSystem()
	 {
		 productSelected[0]= new Product(100, 5, 200,"mouse", "computerRelated");  //int productNumber, int stock, double price, 	String description, String productType
		 productSelected[1]= new Product(101, 5, 200,"movie", "Audio_Video");
		 
		 for(Product p:productSelected)
		 {
			// if(p.getStock())
			 products.add(p); 
		 }
	 }
	 
	
	
	
	// productSelected = new Product(100, 5, 200,"mouse", "computerRelated");
	 
	
	
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
					   customer= new CorporateCustomer("ajesh","usa","corporate","excellent",5000.00,0);
					   selected = true;
					   break;
				   case 2:
					   customer= new PersonalCustomer("ajesh","usa","personal","poor",0);
					   selected=true;
					   break;
				   default:	   
					   System.out.println("Your input is incorrect. Please try again!");
				}
				
				 order = new Order("shipped",today,"prepaid",customer,products); //String status, Date shippedDate,String paymentType, Customer customer
				 
				 
				 System.out.println("1.Show Monthly Report");
					seletedMenu = input.selected();
					
					
			}
			
			//display main menu after customer defined
			
			
			
			
			
			
		}
	}

}
