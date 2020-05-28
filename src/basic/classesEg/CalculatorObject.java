package basic.classesEg;

public class CalculatorObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc1 = new Calculator();
		print(calc1.sum(5, 6));
		print(calc1.minus(8, 5));
		print(calc1.multiply(5, 6));
		print(calc1.divide(12, 3));
		print("Calc1 count: "+ calc1.count);
		
		
		Calculator calc2 = new Calculator();
		print(calc1.sum(5, 6));
		print(calc1.minus(8, 5));
		print(calc1.multiply(5, 6));
		print(calc1.divide(12, 3));
		print("No. of Calculators: "+ calc2.count);	
		
		print("No. of final Calculators: "+ Calculator.count);
				
	}
	
	public static void print(int i) {
		System.out.println(i);
	}
	
	public static void print(String str) {
		System.out.println(str);
	}

}
