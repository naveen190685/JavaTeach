package basic.Inheritance;

public class ElectricCar extends Car {

	@Override
	public String fuelType() {
		return "Electricity";
	}
	
	public void getCarDetails() {
		System.out.println("The fuel Type:"+fuelType());
		System.out.println("No. of Gyres: "+noOfGyres());
		System.out.println("No of seats: "+noOfSeats());
		System.out.println("No of Tyres: " +noOftyres());
	}
}
