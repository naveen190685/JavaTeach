package basic.classesEg;

public class Calculator {
	
	static int count = 0;
	
	public Calculator() {
		count = count+1;
	}

	public int sum(int a, int b) {
		return (a+b);
	}	

	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
}