package project1;

public class Results {
	static int physics = 150;
	static int chemistry = 150;
	static int biology = 1;
	public static void main(String[] args) {
		results (physics, chemistry, biology);
		percentage (physics, chemistry, biology);
	}
	public static void results(int physics,int chemistry, int biology) {
		System.out.println(physics);
		System.out.println(chemistry);
		System.out.println(biology);
		int total = physics + chemistry + biology;
		System.out.println(total);
	}
	public static void percentage(int physics, int chemistry, int biology) {
		int percentage = ((physics + chemistry + biology)*100)/450;

		double passMark= (150 * 0.6);
		int failedSubjects = 0;
		if (percentage < 60)
			System.out.println("You have failed one of your exams");
		else if (percentage > 60 && (physics < passMark || chemistry < passMark || biology < passMark))
			System.out.println("You have failed one of your exams");
		else
			System.out.println(percentage);
		
		if (physics < passMark)
			failedSubjects ++;
			else if (chemistry < passMark)
				failedSubjects ++;
			else if (biology < passMark)
				failedSubjects ++;
		switch(failedSubjects) {
		case 1:
			System.out.println("You have failed one subject");
			break;
		case 2:
			System.out.println("You have failed two subjects");
			break;
		case 3:
			System.out.println("You have failed three subjects");
			break;
		default:
			System.out.println("You have passed all your subjects");
			break;
		}
		}
		



		
}


