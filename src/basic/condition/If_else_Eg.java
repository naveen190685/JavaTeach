package basic.condition;

public class If_else_Eg {

	public static void main(String[] args) {

//		I go office if its a weekday
//		I won't go if its a weekend

		boolean weekday = false;
		String d = "Monday";

		if (weekday) {
			System.out.println("I will be going office");
			if (d.equals("Monday"))
				System.out.println("Today is Monday");
			else
				System.out.println("Today is not Monday");
		}

		else {
			System.out.println("I won't go office");
		}

		// The above is same as
		if (weekday)
			System.out.println("I will be going office");
		else
			System.out.println("I won't go office");

		// Check for Ranom days to go office

		String day = "Sunday";

		if (day.equals("Monday")) {
			System.out.println("Going office Monday");
		} else if (day.equals("Tuesday")) {
			System.out.println("Going office Tuesday");
		} else if (day.equals("Wednesday")) {
			System.out.println("Going");
		} else if (day.equals("Thrusday")) {
			System.out.println("Going");
		} else if (day.equals("Friday")) {
			System.out.println("Going");
		} else {
			System.out.println("Its an off");
		}
		
		
		day = "Monday";
		
//		Quick if else using below code
//		Condition ? <resultIfTrue> : <resultIfFalse>
		
		String Going = day.equals("Monday")? "Going": "Not going";
		
//		Same as
//		if(day.equals("Monday")) Going = "Going";
//		else Going = "Not going";
		
		System.out.println("I will be "+ Going);
	}

}
