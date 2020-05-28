package basic.collectionsEg;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEg {

	public static void main(String[] args) {
		SortedSet<String> sites = new TreeSet<>(); 
        
		sites.add("practice"); 
        sites.add("geeksforgeeks"); 
        sites.add("quiz"); 
        sites.add("code"); 
        
        System.out.println(sites);
        
        
        HashSet<String> veg = new HashSet<String>();
		
		veg.add("palak");
		veg.add("bhindi");
		veg.add("methi");
		veg.add("krela");
		veg.add("gobhi");
		veg.add("krela");
		
		System.out.println("Set of veg: "+veg);
		
		System.out.println("Check it the set contains kela: "+ veg.contains("kela"));
		System.out.println("Check it the set contains krela: "+ veg.contains("krela"));
		
		veg.remove("krela");
		System.out.println("Removing krela from the veg set: "+veg);
		
		System.out.println("\n\n Using FOR EACH LOOP");
		for (String str : veg) {
			System.out.println("Vegetable is: "+str);
		}
		
		
//		Below will give error because you cannot get value at a particular position using set object
//		System.out.println("Veg at positio: 2 is : "+ veg.get(3));
		
		
		System.out.println("\n Using Iterator");
		
		Iterator<String> t = veg.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
        
        
        

	}

}
