package Calculator;

public class SuperCalculator extends SimpleCalculator  implements scientificCalculator{
	
	private static int count;
	
	SuperCalculator(){
		count++;
	}

	@Override
	public float exponential(float f) {
		return Math.getExponent(f);
	}

	@Override
	public double log(double a) {
		return Math.log(a);
		
	}

	@Override
	public float percentage(float x, float y) {
		return (x/y)*100;
	}

	public static int getCount() {
		return count;		
	}

}
