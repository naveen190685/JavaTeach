package basic.OutScope;

import basic.Scope.ClassB;

public class UsingScope2 extends ClassB{

//  If you need to access the protected function of Class B in object of UsingScope2
//	you will need to access it using a function like below
//	
//	public void printProtected() {
//		printProtected();
//	}
	
//	There is no way to access a default member of other class out of the scope of the package
//	where it is defined.
//	This holds true for a default member and protected however protected can be access outside 
//	package using extends but only within class and not in objects.

}
