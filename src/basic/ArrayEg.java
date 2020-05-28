package basic;

public class ArrayEg {

	private static final Object[] String = null;
	private static final Object Months  = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Days = {"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday"};
		
		int[] DayNo = {1,2,3,4,5,6,7};
		
		System.out.println("The length of Days is " + Days.length);
		System.out.println("The DayNo has " + DayNo.length+ " values");
				
		for (int i = 0; i < Days.length; i++) {
			System.out.println("Position: " + i + " Value at Position: "+ Days[i]);
		}
		
//		The below code with give array out of bound as it goes till position 7 of Days array
//		for (int i = 0; i <= Days.length; i++) {
//			System.out.println("Position: " + i + " Value at Position: "+ Days[i]);
//		}
		
		String Months[] = new String[12];
			Months[0] = "jan";
			Months[1] = "feb";
			Months[2] = "mar";
			Months[3] = "april";
			Months[4] = "may";
			Months[5] = "june";
			Months[6] = "july";
			Months[7] = "aug";
			Months[8] = "sep";
			Months[9] = "oct";
			Months[10] = "nov";
			Months[11] = "dec";
			System.out.println(Months[12]);
			
			
//			Months = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug",
//							"Sep", "Oct", "Nov", "Dec"};
		
		
	}

}
