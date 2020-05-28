package basic.Inheritance;

public abstract class Car implements Vehicle {


	private int noOftyres;
	private int noOfGyres;
	private int noOfSeats;
	private String fuelType;
	
	public String brandName;
	
	@Override
	public String transport() {
		return "It transports people";
		
	}

	@Override
	public int noOftyres() {
		noOftyres = 4;
		return noOftyres;
		
	}

	@Override
	public int noOfGyres() {
		noOfGyres = 5;
		return noOfGyres;
		
	}

	@Override
	public int noOfSeats() {
		noOfSeats = 5;
		return noOfSeats;
				
	}
	
	//the method fuelType is not defined here because it can be implemented differently for all fuelTypes cars like diesel car, petrol and electric car
	
	public void getCarDetails() {
		System.out.println(noOfGyres);
		System.out.println(noOfSeats);
		System.out.println(noOftyres);
	}

}
