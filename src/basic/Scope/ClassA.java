package basic.Scope;

public class ClassA {
	
	private int publicVar = 0;
	
	private int privateVar = 1;
	
	private int protectedMember =3;
	
	private int defaultVar = 2;

	private void printPrivate() {
		System.out.println("Private var: "+ privateVar);
	}
	
	protected void printProtected() {
		System.out.println("Protected var: "+protectedMember);
	}
	
	public void printPublic() {
		System.out.println("Public var: " +publicVar);
	}
	
	void printDefault() {
		System.out.println("Default var: "+ defaultVar);
	}
	
}
