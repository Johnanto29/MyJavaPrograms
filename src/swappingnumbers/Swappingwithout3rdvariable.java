package swappingnumbers;

public class Swappingwithout3rdvariable {

	public void swap() {
		int a = 5, b = 6;

		// Before Swapping
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a + b;

		b = a - b;

		a = a - b;
		
		// After Swapping
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) {
		Swappingwithout3rdvariable swp = new Swappingwithout3rdvariable();
		swp.swap();
	}

}
