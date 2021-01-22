package project1;

public class Arrays {
	public static int array[] = new int [10];
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			array[i] = i;
		print(array[i]);}
		for (int j = 0; j< 10; j++) {
			array[j] = j *10;
		print(array[j]);}
		}
	public static void array1() {
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static void array2() {
		//public int [] array= new int [10];
	}
	public static void print(int number) {
		System.out.println(number);
	}
}