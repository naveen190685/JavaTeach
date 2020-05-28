package basic;

public class FunctionsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print("Sum: "+ sum(5, 7));
		print("Minus: "+ minus(9, 4));
		print("Multiplication: "+ multiply(6, 2));
		print("Divide: " + divide(8, 4));	

	}
	
	public static int sum(int a, int b) {
		return (a+b);
	}	

	public static int minus(int a, int b) {
		return a-b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
}
