package Category;

import java.util.Scanner;

import Electronics.Fan;
import Electronics.Fridge;
import Electronics.Laptop;

public class ElectronicItem {
	String brandName;
	int price ;
	int qty;

	@Override
	public String toString() {
		return "ElectronicItem [brandName=" + brandName + ", price=" + price + ", qty=" + qty + "]";
	}

	public ElectronicItem() {
		
	}
	public ElectronicItem(String brandName, int price, int qty) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.qty = qty;
	}

	public  Electronics selectElectronic() {
		
		System.out.println("Press 1 for Fridge");
		System.out.println("Press 2 for Laptop");
		System.out.println("Press 3 for Mobile");
		System.out.println("Press 4 for Fan");

		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		switch (key) {
			case 1: {
				System.out.println("You have selected Fridge items");
				Fridge fd=new Fridge();
				return fd;
			}
			case 2: {
				System.out.println("You have selected Laptop items");	
					Laptop lp=new Laptop();
					return lp;
					}
			case 3: {
				System.out.println("You have selected Mobile items");
				
			}
			case 4: {
				System.out.println("You have selected Fan items");
				Fan fn=new Fan();
				return fn;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}

		}
}
