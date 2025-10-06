package Category;

import java.util.ArrayList;
import java.util.Scanner;

import Sports.SportsMen;
import Sports.SportsWomen;

public class SportItem {
	private String brand;
	private double price;
	private int quantity;
	
	 static ArrayList<Products> prod=new ArrayList<>();
	
	@Override
	public String toString() {
		return "brand=" + brand + ", price=" + price + ", quantity=" + quantity;
	}

	public SportItem() {
		
	}

	public SportItem(String brand, double price, int quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}



	public Sports selectSport() {
		Scanner sc=new Scanner(System.in);
		
		int c;
			System.out.println("Press 1 for Sport Man");
			System.out.println("Press 1 for Sport Women");
			int key=sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("You have selected Sports Man");
				SportsMen sm=new SportsMen();
				return sm;
			}
			case 2: {
				System.out.println("You have selected Sports Woman");
				SportsWomen sw=new SportsWomen();
				return sw;	
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		
		
	}
}
