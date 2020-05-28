package basic.Inheritance;

public class UsingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//You cannot instantiate an interface
//		Vehicle v = new Vehicle();
		
//		You cannot instantiate an abstract
//		Car c1 = new Car();
		
		DieselCar dCar = new DieselCar();
		ElectricCar eCar = new ElectricCar();
		PetrolCar pCar = new PetrolCar();
		
		System.out.println("********** Diesel Car");
		dCar.getCarDetails();
		System.out.println("********** Electric Car");
		eCar.getCarDetails();
		System.out.println("********** Petrol Car");
		pCar.getCarDetails();
		
		
			
	}

}
