package Calculator;

public class SimpleCalculator implements basicCalulator {
	
	private static int count;

	public SimpleCalculator() {
		count = getCount() + 1;
	}

	@Override
	public int sum(int x, int y) {
		return x+y;
	}

	@Override
	public int minus(int x, int y) {
		return x-y;
	}

	@Override
	public int multiply(int x, int y) {
		return x*y;
	}

	@Override
	public float divide(float x, float y) {
		return x/y;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public float sum(float x, float y) {
		return x+y;
	}

	@Override
	public float minus(float x, float y) {
		return  x-y;
	}

	@Override
	public float multiply(float x, float y) {
		return x*y;
	}

}
