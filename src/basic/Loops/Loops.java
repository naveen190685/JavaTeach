package basic.Loops;

public class Loops {

	public static void main(String[] args) {

		int j;
		
//		for(initialization; condition; change in value)
		for (j = 0; j < 5; j++) {
			System.out.println("the value of J is: "+j);
		}
		
		//Last value of j is 5
		System.out.println("Executing while loop");
		
		j = 0;
		
		while (j<5) {
			System.out.println("the value of j: "+j);
			j = j+1;
		}
		
				
		System.out.println("Using Do...While loop now");
//		j = 0;
		
		do {
			System.out.println("The value of J in do..while is: "+ j);
			j++;
//			System.err.println("J: "+j);
		} while (j<8);
		System.out.println("J after Do...while : "+j);
		
		
		String Day = "monday";
		
		String[] Days = {"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("***************** For each loop *****************");
		
//		for( str will store all values in Days one by one for each iteration)
//		read ":" as will store each value of
		for (String str : Days) {
			System.out.println("The day is: "+ str );
		}
		
						
	}

}
