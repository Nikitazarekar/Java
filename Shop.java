package lab5;

import java.util.Scanner;

public class Shop {
	Product shop[];
	static int productCount;
	
	
	public
	 
	Shop()
	{
		shop=new Product[100];
		productCount=0;
	}
	Scanner sc=new Scanner(System.in);
	void addProduct()
	{
		System.out.println("Enter product id,name ,price and quantity");
		int id=sc.nextInt();
		String name=sc.next();
		double price=sc.nextDouble();
		int qty=sc.nextInt();
		
		shop[productCount]=new Product(id,name,qty,price);
		productCount++;
	}
	void displayAll()
	{
		for(int i=0;i<productCount;i++)
		{
			System.out.println(shop[i].toString());
		}
	}
	void searchByID()
	{
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		for(int i=0;i<productCount;i++)
		{
			if(shop[i].getId()==id)
			{
				System.out.println("Found");
				System.out.println(shop[i].toString());
				return;
			}
		}
		System.out.println("Not found");
	}
	
	void updateProductQuantity()
	{
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		for(int i=0;i<productCount;i++)
		{
			if(shop[i].getId()==id)
			{
				System.out.println("Enter Quantity");
				int qty=sc.nextInt();
				shop[i].setQty(qty);
				System.out.println("Quantity updated successfully");
			}
		}
	}
	
	void removeProductByID()
	{
		System.out.println("Enter the ID:");
		int id=sc.nextInt();
		for(int i=0;i<productCount;i++)
		{
			if(shop[i].getId()==id)
			{
				for(int j=i;j<productCount-1;j++)
				{
					shop[j]=shop[j+1];
					
				}
				shop[productCount-1]=null;
				System.out.println("Product removed successfully");
				return;
			}
		}
		System.out.println("Not found");
	}
		void calInventoryValue()
		{
			double total=0;
			for(int i=0;i<productCount;i++)
			{
				total=total+shop[i].getGrossPrice();
			}
			System.out.println("Total Inventory value:"+total);
		
	}
}
