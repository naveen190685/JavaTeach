package basic;

public class StringEgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Subrat Mohanty";
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println("position: "+ i + " Char: "+ name.charAt(i));	
		}
	
		//Uppercase conversion
		System.out.println(name.toUpperCase());
		//Lowercase conversion
		System.out.println(name.toLowerCase());
		// Have a substring from position 5 till 10
		System.out.println(name.substring(5, 10));
		
		String[] NAME = name.split(" ");
		for (String string : NAME) {
			System.out.println(string);
		}
		
		int i = 345;
		
		// Converting int to String
		String number = String.valueOf(i);
		
		System.out.println(number);
		
		// Converting String to int
		int IntValueOfNumber = Integer.parseInt(number);
		System.out.println(IntValueOfNumber);

		if(name.contains("cat")) System.out.println("Contains substring");
		else System.out.println("Don't contain substring");
		
	}

}
