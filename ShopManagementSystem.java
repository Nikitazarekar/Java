package lab5;

import java.util.Scanner;

public class ShopManagementSystem {

	public static void main(String[] args) {
		Shop s=new Shop();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("---- Shop Menu ----");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product by ID");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Display all Product");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            ch= sc.nextInt();
			switch(ch)
			{
			case 1:
					s.addProduct();
					break;
			case 2:
				s.removeProductByID();
				break;
			case 3:
				s.searchByID();
				break;
			case 4:
				s.updateProductQuantity();
				break;
			case 5:
				s.displayAll();
				break;
			case 6:
				s.calInventoryValue();
				break;
			case 7:
				System.out.println("Exiting..");
				break;
			}
			
			
		}while(ch!=7);
	}

}
