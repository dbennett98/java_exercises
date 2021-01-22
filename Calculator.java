package project1;

public class Calculator {
	static int num1 = 10;
	static int num2 = 100;
	public static void addition() {
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void multiplication () {
		int result = num1 * num2;
		System.out.println(result);
	}
	public static void subtraction () {
			int result = num1 - num2;
			System.out.println(result);
	}	
	public static void division() {
		if (num1  > num2) {
			int result = num1 / num2;
			
			System.out.println(result);
		}else  {
			System.out.println("This division cannot be performed");
		}
	}
	public static void addition(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void multiplication (int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}
	public static void subtraction (int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);	
	}	
	public static void division(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(result);
	}
	public static void main(String[] args) {
		addition(num1,num2);
		multiplication(num1,num2);
		subtraction(num1,num2);
		division(num1,num2);

	}
}
