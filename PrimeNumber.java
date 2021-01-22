package project1;

public class PrimeNumber {
	public static void main(String[] args) {
		primeNumber(9);
	}
	public static void primeNumber(int num) {
		if (num>=1) {
			for (int i=1; i<=num; i++) {
				if (num%i == 1) {
					System.out.println(num + " is a prime number");
					break;
				}
		else {
			System.out.println("Not a prime number");
		}
	}
}
	}
}