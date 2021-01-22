package project1;

public class BlackJack {
	public static void main(String[] args) {
		blackjack(20,18);
	}
	public static void blackjack(int num1, int num2) {
		if (num1 > 21 && num2 >21) {
			System.out.println(0);
		} else if (num1>21 && num2<21) {
			System.out.println(num2);
		} else if (num2>21 && num1<21) {
			System.out.println(num1);
		} else if (num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		}
	}
