package basic.OutScope;

import basic.Scope.ClassB;

public class UsingScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b = new ClassB();
		b.printPublic();
		
		
		//In this class, none of the default and protected members of class B are visible/accessible
		
		

	}

}
