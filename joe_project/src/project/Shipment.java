package project;

import java.util.Date;
import java.util.List;

public class Shipment {
	Date today= new Date();
	
	public void setShipmentDate(List<Product> shippingProduct)
	{
		 for(Product p:shippingProduct)
		 {
			if(p.getStock()>0)
			{
				p.setShipmentDateOfCurrentStock(today);
			}
			
			else
			{
				Date dateAfterOneWeek = new Date(today.getTime()+7*24*3600*1000);
				p.setShipmentDateOfCurrentStock(dateAfterOneWeek);
			}
		 }
	}

}
