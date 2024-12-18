package assignment09dec2024;

public class Primenumbers {

	public String findprime(int input) {

		double a = 0;
		String result = null;

		a = input / 2;

		if (a == 0) {
			result = "not prime number";
		} else if (a % 2 != 0) {

			result = "prime number";

			return result;

		}
		return result;

	}

	public static void main(String[] args) {
		Primenumbers val = new Primenumbers();
		String finalval = val.findprime(9);

		System.out.println("the number is " + finalval);

	}
}