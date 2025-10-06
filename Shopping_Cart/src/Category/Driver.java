package Category;

import java.util.Scanner;

import Electronics.Fan;

public class Driver {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ElectronicItem ele=new ElectronicItem("a",1,2);
		SportItem sp=new SportItem();
		Products cl= new Products();
		
		 char c;
		do {
			System.out.println("Press 1 for Sports Item ");
			System.out.println("Press 2 for Electronics Item ");
			System.out.println("Press 3 for Clothes Item ");
			System.out.println("Enter Choice : ");
			int key=sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("You have Selected Sports item");
				Sports s=sp.selectSport();
				s.showSport();	
				break;
			}
			case 2: {
				System.out.println("You have Selected Electronic item");
				
				Electronics el=ele.selectElectronic();
				el.Electronic();
				break;
			}
			case 3: {
				System.out.println("You have Selected Clothes item");
				Clothes cs=cl.selectProduct();
				cs.product();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
					
			System.out.println("Products : Electronic  / Sport / Clothes ?");
			System.out.println("Do you want to choose again for continue press Y/y !");
			
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
	}
}
