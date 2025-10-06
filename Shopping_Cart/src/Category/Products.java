package Category;

import java.util.Scanner;

import Clothes.Kids;
import Clothes.Men;
import Clothes.Women;

public  class Products{
	private String brand;
	private double price;
	private String color;
	
	public Products(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public Products() {
		
	}

	@Override
	public String toString() {
		return "brand -> " + brand + "| price -> " + price + "| color -> " + color;
	}
	
	public  Clothes selectProduct() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	
			System.out.println("Press 1 for Men Items");
			System.out.println("Press 2 for Women Items");
			System.out.println("Press 3 for Kids Items");
			System.out.println("Enter Choice : ");
			int key=sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("You have selected Men items");
				Men mn=new Men();
				return mn;
			}
			case 2: {
				System.out.println("You selected Women items");
				Women wn=new Women();
				return wn;
			}
			case 3: {
				System.out.println("You selected Kids items");
				Kids kd=new Kids();
				return kd;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		
	}
}
