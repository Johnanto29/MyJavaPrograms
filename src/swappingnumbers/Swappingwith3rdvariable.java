package swappingnumbers;

public class Swappingwith3rdvariable {
public void swapvar() {
	int a= 8, b= 4;
	int c;
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	
	c = a ;
	a = b;
	b = c;
	
	


	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	
			
}

public static void main(String[] args) {
	Swappingwith3rdvariable swpv = new Swappingwith3rdvariable();
	swpv.swapvar();
}
}
