package Clothes;

import java.util.ArrayList;
import java.util.Scanner;

import Category.Clothes;
import Category.Products;

public class Kids implements Clothes{
	 static ArrayList<Products> prod=new ArrayList<>();
	@Override
	public void product() {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char c;
		do {
			System.out.println("Press 1 for Kids Jeans Items");
			System.out.println("Press 2 for kids Shirts Items");
			System.out.println("Press 3 for  kids T-shirts Items");
				System.out.println("Enter Choice : ");
				int ch=sc.nextInt();
			switch (ch) {
					case 1: {
							System.out.println(" kids Jeans");
							System.out.println(" kids Jeans2");
							System.out.println(" kids Jeans3");
							System.out.println(" kids Jeans4");
							break;
						}
					case 2: {
						System.out.println(" kids Shirts");
						System.out.println(" kids Shirts2");
						System.out.println(" kids Shirts3");
						System.out.println(" kids Shirts4");
						break;
					}
					case 3: {
						System.out.println(" kids T-shirts");
						System.out.println(" kids T-shirts2");
						System.out.println(" kids T-shirts3");
						System.out.println(" kids T-shirts4");
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
	
	public static void  jeansForKids (){
		prod.add(new Products("Shirt1",432.3,"white"));
		prod.add(new Products("Shirt2",543,"mahroon"));
		prod.add(new Products("Shirt3",6543.3,"aqua"));
		prod.add(new Products("Shirt4",987.3,"yellow"));
		prod.add(new Products("Shirt5",1287,"black"));
		prod.add(new Products("Shirt6",9783,"navy blue"));
	}
	public static void  shirtForKids (){

	}
	public static void tShirtForKids(){

	}
	
	
}
