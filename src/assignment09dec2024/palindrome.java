package assignment09dec2024;

public class palindrome {
	public String palindromecheck() {
		String str;
		str = "madam";
		String palindrome="";
	

		for (int i = str.length() - 1; i >= 0; i--)
			palindrome += str.charAt(i);
		System.out.println(palindrome);
		//str.compareTo(palindrome);
		boolean value = false;

		if (str.equals(palindrome)   ) {

			value = true ;
			System.out.println("is Madam palindome?  " + value);

		} else {
			System.out.println("The input is a not palindrome");

		}
		return str;
		
		
	}

	public static void main(String[] args) {
		palindrome str = new palindrome();
		str.palindromecheck();
		

	}
}