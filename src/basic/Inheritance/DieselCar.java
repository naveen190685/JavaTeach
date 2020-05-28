package basic.Inheritance;

public class DieselCar extends Car implements MarutiBrand{

	@Override
	public String fuelType() {
		return "Diesel";
	}
	
	public void getCarDetails() {
		System.out.println("The fuel Type:"+fuelType());
		System.out.println("No. of Gyres: "+noOfGyres());
		System.out.println("No of seats: "+noOfSeats());
		System.out.println("No of Tyres: " +noOftyres());
		System.out.println("Brand: "+ myBrandName());
		System.out.println("Model ID: "+ myModelId());
	}

	@Override
	public String myBrandName() {
		// TODO Auto-generated method stub
		return"Swift";
	}

	@Override
	public int myModelId() {
		// TODO Auto-generated method stub
		return 459874597;
	}
	
	
	
	

}
