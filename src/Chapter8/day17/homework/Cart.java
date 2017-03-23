package Chapter8.day17.homework;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	Map<Product,Integer> map = new HashMap<>();
	
	public void showAllProducts() {		
		map.forEach((Product,Integer) ->
		System.out.println(Product.toString() + "," + Integer));
	}
}
