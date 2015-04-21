package project;

public class Stock {
	
	int productId;
	int count;
	
	public Stock(int producId,int count)
	{
		this.productId=productId;
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
