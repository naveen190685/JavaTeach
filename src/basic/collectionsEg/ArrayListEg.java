package basic.collectionsEg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Guava");
		
		for (String string : fruits) {
			System.out.println(string);
		}
		
		System.out.println("Fruit at positio: 3 is : "+ fruits.get(3));
		
		
		fruits.remove(2);
		System.out.println("After removing at position: 2");
		for (String string : fruits) {
			System.out.println(string);
		}
		
		if(fruits.contains("Banana")) System.out.println("Yes, it has banana");
		else System.out.println("Banana missing");
		
		Collections.sort(fruits);
		System.out.println(fruits);
		
		Collections.reverse(fruits);
		System.out.println(fruits);
		
		
		System.out.println("\n\n\n*****************Using iterator");
		Iterator<String> s = fruits.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
	}

}
