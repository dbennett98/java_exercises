package project1;

public class Flowchart {
	public static void main(String[] args) {
		flowchart(1, 2, true);
		flowchart2(2000);
	}
	public static void flowchart(int num1, int num2, boolean boo) {
		int sum ;
		int multi;
		if (boo) {
			sum = num1 + num2;
			System.out.println(sum);
		} else {
			multi = num1 * num2;
			System.out.println(multi);
			}
	}
	public static void flowchart2(int num) {
		if (num<=2000){
			System.out.println(1);
			if (num>100) {
				System.out.println(3);
				if (num>600) {
					System.out.println(5);
				} else {
					System.out.println(4);
					if (num>500) {
						System.out.println(6);
					}else {
						System.out.println(7);
					}
				}
			}else {
				System.out.println(2);
		} }else {
			System.out.println("A");
			if (num>6000) {
				System.out.println("C");
			}else {
				System.out.println("B");
				if (num>4000) {
					System.out.println("D");
				}else {
					System.out.println("E");
				}
				
			}
		}
	}
	
}

