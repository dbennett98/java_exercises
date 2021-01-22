package project1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayLists {
	 public static void main(String[] args){
		 List<String> food = new ArrayList<>();
		 food.add("Pizza");
		 food.add("Burger");
		 food.add("Pasta");
		 
		 for (int i=0; i < food.size(); i++) {
			 System.out.println(food.get(i));
		 	}
		for (String i : food) {
				System.out.println(i);
			}
		food.set(1, "Tacos");
		food.remove(0);
		Collections.sort(food);
		System.out.println(food);
	 	}
	 }
