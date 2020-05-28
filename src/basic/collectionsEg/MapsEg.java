package basic.collectionsEg;

import java.util.HashMap;

public class MapsEg {

	public static void main(String[] args) {
		
		HashMap<String, Integer> fruits = new HashMap<String, Integer>();
		fruits.put("Apples", 280);
		fruits.put("Banana", 30);
		fruits.put("Grapes", 440);
		fruits.put("Berries", 300);
		fruits.put("kiwi", 30);
				
		System.out.println(fruits);
		
		System.out.println("What is the rate of Grapes");
		System.out.println("Rate of Grapes is: "+ fruits.get("Grapes"));
		
		fruits.remove("kiwi");
		System.out.println("Removed kiwi from my shop. \nUpdate list is: "+fruits);
		
		System.out.println("Customer: What do you have?");
		System.out.println(" I have: "+ fruits.keySet() + " on sale");
		
		
		//Complex example to have a Item category and item price collectively
		HashMap<String, HashMap<String, Integer>> Items = 
				new HashMap<String, HashMap<String, Integer>>();
		
		Items.put("Fruits", fruits);
		
		System.out.println("Grapes price:	" + Items.get("Fruits").get("Grapes"));
		
		
		
	}
}