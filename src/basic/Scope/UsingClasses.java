package basic.Scope;

public class UsingClasses {

	public static void main(String[] args) {
		
		
		//No access to private on creating object
		ClassA a = new ClassA();
		a.printDefault();
		a.printProtected();
		a.printPublic();
		
		//No access to private even when having it inherited in B
		System.out.println("\n\n****** Class B object");
		ClassB b = new ClassB();
		b.printDefault();
		b.printProtected();
		b.printPublic();
		

	}

}
