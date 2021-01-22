package project1;

public class Coins {
	public static void main(String[] args) {
		change(104.78,100);
	}
	public static void change(double num,double cost) {
		double changeDue ;
			changeDue =  num - cost;
		int tenNote ;
			tenNote = (int)(changeDue / 10);
		int fiveNote ;
			fiveNote = (int)(changeDue - (tenNote*10))/5;
			System.out.println(tenNote + " £10 note");
			System.out.println(fiveNote + " £5 note");
		int twentyPence; 
		twentyPence = (int)(((changeDue - (tenNote*10)) - (fiveNote*5))/0.2);
			System.out.println(twentyPence + " 20p's");
		int twoPence ;
		twoPence = (int)((((changeDue- (tenNote*10))-(fiveNote*5))-(twentyPence*0.2))/0.02);
				System.out.println(twoPence + " 2p's");
	}
}

