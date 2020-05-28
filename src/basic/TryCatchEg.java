package basic;

public class TryCatchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Days = { "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday" };

		for (int i = 0; i <= Days.length; i++) {
			try {

				System.out.println("Day: " + Days[i]);
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.err.println("Interruption from the wait happened");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.err.println("The position tried to access in greater than the size of Day array");
			
			} catch (Exception e) {
				
				System.out.println(e.toString());
				
			}
		}
	}

	public static void wait(int i) throws InterruptedException {
		Thread.sleep(i);
	}

}
