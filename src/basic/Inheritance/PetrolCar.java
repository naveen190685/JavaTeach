package basic.Inheritance;

public class PetrolCar extends Car {
	@Override
	public String fuelType() {
		return "Pertrol";
	}
	
	public void getCarDetails() {
		System.out.println("The fuel Type:"+fuelType());
		System.out.println("No. of Gyres: "+noOfGyres());
		System.out.println("No of seats: "+noOfSeats());
		System.out.println("No of Tyres: " +noOftyres());
	}
}
