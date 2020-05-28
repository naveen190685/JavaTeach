package basic;

public class Check {

	public static void main(String[] args) {
		
		String firstName = "nitin", reverse = null;
		//String secondName = "Naveen";
		
		int length = firstName.length();
		for (int i = length-1; i >=0; i--) {
			reverse = reverse+ firstName.charAt(i);
		}
		
		System.out.println(firstName);
		System.out.println(reverse);
			if (firstName.equals(reverse)) {
				System.out.println("equal");
			}
			else {
				System.out.println("Not equal");
			}
				
	}
}
