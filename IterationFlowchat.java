package project1;

public class IterationFlowchat {
	public static void main(String[] args) {
		oneToTenTwo(3);
	}
	public static void flowchart() {
		int A = 100;
		if (A > 200) {
		}else {
			System.out.println("A");
			A ++;
	}
}
	public static void flowchart2() {
		int A = 100;
		do{
			if (A%2 == 0) {
				System.out.println("-");
			}else {
					System.out.println("*");
			}
			A++;
		} while (A<=200);
			
				
	}
	public static void oneToTen() {
		for(int j = 1; j <=10; j++) {
		for(int i = 1; i<=10; i++) {
			int output;
			output = i;
		System.out.println(output);
		}
		}
	}
	public static void oneToTenTwo(int num) {
		for(int i=1; i <10; i++) {
			System.out.println(num);
		if(i == num) {
			break;
		}
			}
		}
	
}
