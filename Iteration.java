package project1;

public class Iteration {
	public static void main(String[] args) {
		numbers2(1001);
	}
	public static void numbers(int number) {
		int total = 0;
		while(number>0) 
		{
			total = total + number%10;
			number = number/10;
		}
		System.out.println("Sum of digits:" + total);
	}
	
	public static void numbers2(int num) {
	String singleDigit [] =  {"","one","two","three","four","five","six","seven","eight","nine",
							  "Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String twoDigit [] =  {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	String threeDigit [] = {" ","One Hundred", "Two Hundred", "Three Hundred","Four Hundred","Five Hundred",
			                "Six Hundred","Seven Hundred","Eight Hundred","Nine Hundred"};
	String fourDigit [] = {"One Thousand", "Two Thousand", "Three Thousand", "Four Thousand","Five Thousands", 
			               "Six Thousand", "Seven Thousand","Eight Thousand","Nine Thousand"};
	String firstDigit = singleDigit[num%10];
	int secondDigit = 0 ;
	if (num>9 && num <20){
		firstDigit = singleDigit[num];
		System.out.println(firstDigit);
	}
	if (num < 100) {
		secondDigit = num/10;
		String secondDigit1 = twoDigit[secondDigit];
		System.out.println(secondDigit1 + firstDigit);
	} else if (num <1000) {
		secondDigit = num/100;
		String secondDigit1 = twoDigit[secondDigit];
		int thirdDigit = num/100;
		String thirdDigit1 = threeDigit[thirdDigit];
		System.out.println(thirdDigit1 +" "+ secondDigit1 + firstDigit);
	} else {
		secondDigit = num/1000;
		String secondDigit1 = twoDigit[secondDigit];
		int thirdDigit = num/1000;
		String thirdDigit1 = threeDigit[thirdDigit];
		int fourthDigit = num/1000;
		String fourthDigit1= fourDigit[fourthDigit];
		System.out.println(fourthDigit1 +" "+ thirdDigit1 +" "+ secondDigit1 + firstDigit);
	}
	}

}
			
	


