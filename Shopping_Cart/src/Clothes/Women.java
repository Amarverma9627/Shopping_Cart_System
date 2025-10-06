package Clothes;

import java.util.Scanner;

import Category.Clothes;

public class Women implements Clothes{

	@Override
	public void product() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char c;
		do {
			System.out.println("Press 1 for kurti Items");
			System.out.println("Press 2 for Shirts Items");
			System.out.println("Press 3 for Suits Items");
				System.out.println("Enter Choice : ");
				int ch=sc.nextInt();
			switch (ch) {
					case 1: {
							System.out.println("kurti ");
							System.out.println("kurti 2");
							System.out.println("kurti 3");
							System.out.println("kurti 4");
							break;
						}
					case 2: {
						System.out.println("Shirts");
						System.out.println("Shirts2");
						System.out.println("Shirts3");
						System.out.println("Shirts4");
						break;
					}
					case 3: {
						System.out.println("Suits ");
						System.out.println("Suits 2");
						System.out.println("Suits 3");
						System.out.println("Suits 4");
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
	
			public static void KurtiForWomen (){
				
			}
			public static void JeansForWomen(){
			
			}



}
