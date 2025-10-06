package Sports;

import java.util.Scanner;

import Category.Sports;

public class SportsMen implements Sports{

	@Override
	public void showSport() {
		Scanner sc=new Scanner(System.in);
		char c;
		do {
			System.out.println("Press 1 for Trouser Items");
			System.out.println("Press 2 for	Cap Items");
			//System.out.println("Press 3 for T-shirt Items");
				System.out.println("Enter Choice : ");
				int ch=sc.nextInt();
			switch (ch) {
					case 1: {
							TrouserSport.getAdd();
							TrouserSport.getDisplay();
							break;
						}
					case 2: {
						CapSport.getAdd();
						CapSport.getDisplay();
						break;
					}
				
				default:{
					throw new IllegalArgumentException("Unexpected value: " + ch);
					}
					
			}
				System.out.println("Continue for press Y/y");
				c=sc.next().charAt(0);
			}while(c=='y' || c=='Y');
		
	}

}
