package project;

public class Payment {
	
	Customer customer;
	double paidAmount=0;
	double creditAmount=0;
	
	
	public void makePayment(Customer customer,Order order)
	{
		double totalPrice=order.totalPrice();
		if(customer instanceof CorporateCustomer)
		{
			CorporateCustomer currentCustomer = (CorporateCustomer) customer;
			if(totalPrice>=currentCustomer.getCreditLimit()&&
			  (currentCustomer.getCreditType().equals("excellent")||currentCustomer.getCreditType().equals("excellent")))
			{
				if(checkForDiscountEligiblity(currentCustomer))
				{
				  paidAmount=totalPrice-totalPrice*0.4;
				  currentCustomer.setCreditLimit(currentCustomer.getCreditLimit()-totalPrice-totalPrice*0.4);
				}
				
				else
				{
					paidAmount=totalPrice;
					  currentCustomer.setCreditLimit(currentCustomer.getCreditLimit()-totalPrice);
				}
			}
			
			else
			{
				if(checkForDiscountEligiblity(currentCustomer))
				{
				 paidAmount=currentCustomer.getCreditLimit();
				 creditAmount=totalPrice-paidAmount;
				}
				
				else
				{
					 paidAmount=currentCustomer.getCreditLimit();
					 creditAmount=totalPrice-paidAmount;
				}
			}
		}
		
		else if(customer instanceof PersonalCustomer)
		{
			paidAmount=totalPrice;
		}
	}

	
	public boolean checkForDiscountEligiblity(Customer customer)
	{
		if(customer.getPoint()>24)
			return true;
		else return false;
	}
}
