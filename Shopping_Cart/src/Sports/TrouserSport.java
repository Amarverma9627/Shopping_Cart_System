package Sports;

import java.util.ArrayList;

import Category.Products;
import Category.SportItem;

public class TrouserSport extends SportsMen{
	 static ArrayList<SportItem>  prod=new ArrayList<>();

		
		public static void getAdd() {
			prod.add(new SportItem("excel",222.3,2));
			prod.add(new SportItem("excel2",600,3));
			prod.add(new SportItem("excel3",5004.3,2));
			prod.add(new SportItem("excel4",2322.3,2));
			prod.add(new SportItem("excel5",4322,2));
			prod.add(new SportItem("excel6",33443,2));
		}
		public static void getDisplay() {
			for(SportItem x:prod) {
				System.out.println(x);
			}
		}
}
