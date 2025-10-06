package Clothes;

import java.util.ArrayList;
import java.util.Scanner;

import Category.Clothes;
import Category.Products;

public class Men implements Clothes{
	 static ArrayList<Products>  prod=new ArrayList<>();
	@Override
	public void product() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char c;
		do {
			System.out.println("Press 1 for Jeans Items");
			System.out.println("Press 2 for Shirts Items");
			System.out.println("Press 3 for T-shirts Items");
				System.out.println("Enter Choice : ");
				int ch=sc.nextInt();
			switch (ch) {
					case 1: {
							
							jeansForMan();
							getDisplay();
							break;
						}
					case 2: {
						shirtForMan();
						getDisplay();
						break;
					}
					case 3: {
						TshirtForMan();
						getDisplay();
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
	
	
		public static void jeansForMan() {
			prod.add(new Products("excel",222.3,"red"));
			prod.add(new Products("excel2",600,"mahroon"));
			prod.add(new Products("excel3",5004.3,"black"));
			prod.add(new Products("excel4",2322.3,"yellow"));
			prod.add(new Products("excel5",4322,"black"));
			prod.add(new Products("excel6",33443,"grey"));
		
		}
		
	public static void getDisplay() {
			for(Products x:prod) {
				System.out.println(x);
			}
		}
	
	public static void  shirtForMan() {
		prod.add(new Products("Shirt1",432.3,"white"));
		prod.add(new Products("Shirt2",543,"mahroon"));
		prod.add(new Products("Shirt3",6543.3,"aqua"));
		prod.add(new Products("Shirt4",987.3,"yellow"));
		prod.add(new Products("Shirt5",1287,"black"));
		prod.add(new Products("Shirt6",9783,"navy blue"));
		
	}

	public static void TshirtForMan() {
		prod.add(new Products("T-Shirt1",700,"green"));
		prod.add(new Products("T-Shirt2",554,"Skyblue"));
		prod.add(new Products("T-Shirt3",765.3,"black"));
		prod.add(new Products("T-Shirt4",876.3,"yellow"));
		prod.add(new Products("T-Shirt5",980,"orange"));
		prod.add(new Products("T-Shirt6",300,"grey"));
	}
		
}
