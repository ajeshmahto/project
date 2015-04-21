package project;

public class Payment {
	
	Customer customer;
	
	
	public void makePayment(Customer customer,Order order)
	{
		if(customer instanceof CorporateCustomer)
		{
			CorporateCustomer currentCustomer = (CorporateCustomer) customer;
			if(order.totalPrice()>=currentCustomer.getCreditLimit())
			{
				currentCustomer.setCreditLimit(currentCustomer.getCreditLimit()-order.totalPrice());
			}
		}
	}

}
