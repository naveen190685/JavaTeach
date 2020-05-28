package Calculator;

public class implementingSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleCalculator s = new SimpleCalculator();
		
		//Below is how you can instantiate
		//All methods in basic are implemented in simple
		basicCalulator bSimple = new SimpleCalculator();
		
//		Below is wrong implementation as the left side don't implement the methods.
//		basicCalulator bSimpleEg = new basicCalulator();
		
		SuperCalculator sC = new SuperCalculator();
		sC.exponential((float) 2.34d);
		
		
//		All the extra functions implemented in SuperCalculator will be ignored
//		And only the once basicCalculator asked will be available
		basicCalulator bSci = new SuperCalculator();
		bSci.multiply(4, 6);
		
	}

}
