package basic.condition;

public class SwitchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Thrusday";
		
		switch (day) {
		case "Monday":
				System.out.println("Working day: Monday");
			break;

		case "Tuesday":
			System.out.println("Working day: Tuesday");
		break;
		
		case "Wednesay":
			System.out.println("Working day: Wednesday");
		break;
		
		case "Thrusday":
			System.out.println("Working day: Thrusday");
		break;
		
		case "Friday":
			System.out.println("Working day: Friday");
		break;
			
		default:
			System.out.println("Its off today, Stay home");
		break;
		}		
	}

}
