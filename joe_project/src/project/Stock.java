package project;

public class Stock {
	
	int productId;
	int count;
	private Product product;
	
	public Stock(Product product,int count)
	{
		this.product=product;
		this.count=count;
	}
	
	public void deductStock(int quantity)
	{
		 if(count>quantity)
		 {
			 count-=quantity;
		 }
		 
		 else
		 {
			 count=0;
		 }
	}

}
