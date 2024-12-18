package swappingnumbers;

public class swappingwithout3rdvariable {

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
		swappingwithout3rdvariable swp = new swappingwithout3rdvariable();
		swp.swap();
	}

}
