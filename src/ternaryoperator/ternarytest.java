package ternaryoperator;

public class ternarytest {
	public String ternary(int age) {
		
		String value;
		if(age>18) {
			
			value= "can vote";
		}
		
		else 
		{
			value= "cannot vote";
		}
		return value;
	}
public static void main(String[] args) {
	ternarytest ob = new ternarytest();
	ob.ternary(24);
	System.out.println(ob.ternary(12));
	System.out.println(ob.ternary(24));
	
	int age = 23;
	
	String Voting  = age > 18 ? "can vote" : "cannot vote";
	
	System.out.println(Voting);
}
}
