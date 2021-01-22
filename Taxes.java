package project1;

public class Taxes {
	public static void main(String[] args) {
		salarytax(10000);
		taxamount(25000);
	}
	public static void salarytax(int salary) {
		int PercentTax = 0;
		if (salary<15000) {
			PercentTax = 0;
		} else if (salary<20000) {
			PercentTax = 10;
		} else if (salary<30000) {
			PercentTax = 15;
		}else if (salary<45000) {
			PercentTax = 20;
		} else {
			PercentTax = 25;
		}
		System.out.println(PercentTax);
		}
	public static void taxamount(int salary) {
		double TaxedAmount = 0;
		if (salary<15000) {
			TaxedAmount = salary*0;
		} else if (salary<20000) {
			TaxedAmount = salary*0.1;
		} else if (salary<30000) {
			TaxedAmount = salary*0.15;
		}else if (salary<45000) {
			TaxedAmount = salary*0.2;
		} else {
			TaxedAmount = salary*0.25;
		}
		System.out.println(TaxedAmount);
	}
}
