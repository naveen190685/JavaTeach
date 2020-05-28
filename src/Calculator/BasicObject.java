package Calculator;

public class BasicObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basicCalulator c = new SimpleCalculator();
		
		System.out.println(c.sum(6, 7));
		System.out.println(c.multiply(8, 4));
		
		basicCalulator Sc = new SuperCalculator();

	}
}
